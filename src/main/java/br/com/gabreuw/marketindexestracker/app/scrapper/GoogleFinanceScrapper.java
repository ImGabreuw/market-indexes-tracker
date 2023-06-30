package br.com.gabreuw.marketindexestracker.app.scrapper;

import br.com.gabreuw.marketindexestracker.domain.adapter.QuotationScrapper;
import lombok.extern.log4j.Log4j2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Log4j2
@Component
public class GoogleFinanceScrapper implements QuotationScrapper {
    @Override
    public QuotationDTO extract(String assetCode) {
        try {
            Document document = Jsoup.connect("https://www.google.com/finance/quote/%s".formatted(assetCode)).get();

            Element priceElement = document
                    .getElementsByClass("rPF6Lc")
                    .first();
            Element variationElement = document
                    .getElementsByClass("JwB6zf")
                    .get(18);

            if (priceElement == null | variationElement == null) return null;

            String rawPrice = priceElement.text();
            String rawVariation = variationElement.text();

            return new QuotationDTO(rawPrice, rawVariation);
        } catch (IOException e) {
            log.error("Error during extracting '%s' quotation from Google Finance.", e);
            return null;
        }
    }
}
