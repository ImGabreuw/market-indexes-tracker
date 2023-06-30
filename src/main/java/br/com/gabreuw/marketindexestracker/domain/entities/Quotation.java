package br.com.gabreuw.marketindexestracker.domain.entities;

import br.com.gabreuw.marketindexestracker.shared.helpers.NumberHelper;

import java.io.Serializable;

public record Quotation(Float price, Float variation) implements Serializable {
    public static Quotation create(Float price, Float variation) {
        if (price == null) {
            throw new IllegalArgumentException("Price is mandatory");
        }

        if (variation == null) {
            throw new IllegalArgumentException("Variation is mandatory");
        }


        if (price <= 0) {
            throw new IllegalArgumentException("Invalid quotation price.");
        }

        return new Quotation(price, variation);
    }

    public String getFormattedPrice() {
        return NumberHelper.formatCurrency(price);
    }

    public String getFormattedVariation() {
        return NumberHelper.formatPercentage(variation);
    }
}
