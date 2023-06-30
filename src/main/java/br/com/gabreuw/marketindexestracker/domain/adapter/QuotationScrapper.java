package br.com.gabreuw.marketindexestracker.domain.adapter;

public interface QuotationScrapper {

    QuotationDTO extract(String assetCode);

    record QuotationDTO(String price, String variation) {
    }

}
