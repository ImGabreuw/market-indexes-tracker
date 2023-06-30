package br.com.gabreuw.marketindexestracker.domain.usecases;

import br.com.gabreuw.marketindexestracker.domain.adapter.QuotationScrapper;
import br.com.gabreuw.marketindexestracker.domain.entities.Quotation;
import br.com.gabreuw.marketindexestracker.shared.helpers.NumberHelper;
import br.com.gabreuw.marketindexestracker.shared.usecase.UseCase;
import org.springframework.stereotype.Component;

@Component
public record GetMarketIndexQuotationUseCase(
        QuotationScrapper quotationScrapper
) implements UseCase<GetMarketIndexQuotationUseCase.InputValues, GetMarketIndexQuotationUseCase.OutputValues> {

    @Override
    public OutputValues execute(InputValues input) {
        String assetCode = input.assetCode();

        QuotationScrapper.QuotationDTO dto = quotationScrapper.extract(assetCode);
        Quotation result = new Quotation(
                normalize(dto.price()),
                normalize(dto.variation())
        );

        return new OutputValues(result);
    }

    private Float normalize(String raw) {
        raw = raw
                .trim()
                .replace(",", "")
                .replace("%", "");

        return NumberHelper.parse(raw);
    }

    public record InputValues(String assetCode) implements UseCase.InputValues {
    }

    public record OutputValues(Quotation marketIndex) implements UseCase.OutputValues {
    }

}
