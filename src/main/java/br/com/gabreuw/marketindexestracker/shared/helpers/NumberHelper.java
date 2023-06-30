package br.com.gabreuw.marketindexestracker.shared.helpers;

import lombok.NoArgsConstructor;

import java.text.NumberFormat;
import java.util.Locale;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class NumberHelper {

    private static final Locale LOCALE_PT_BR = new Locale("pt", "BR");
    private static final NumberFormat NUMBER_PT_BR = NumberFormat.getNumberInstance(LOCALE_PT_BR);
    private static final NumberFormat CURRENCY_PT_BR = NumberFormat.getCurrencyInstance(LOCALE_PT_BR);

    public static boolean isFloat(String raw) {
        try {
            Float.parseFloat(raw);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Float parse(String raw) {
        if (!isFloat(raw)) {
            return null;
        }

        return Float.parseFloat(raw);
    }

    public static String formatCurrency(Float amount) {
        return CURRENCY_PT_BR.format(amount);
    }

    public static String formatPercentage(Float number) {
        return NUMBER_PT_BR.format(number) + "%";
    }

}
