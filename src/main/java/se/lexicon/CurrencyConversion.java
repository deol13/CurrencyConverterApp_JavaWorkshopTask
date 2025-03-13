package se.lexicon;

/**
 * Helper class for converting currency
 * */
public class CurrencyConversion {

    public static double convertSEKToUSD(double sekAmount){
        return sekAmount * ConversionRates.SEK_TO_USD_RATE;
    }
    public static double convertUSDToSEK(double usdAmount){
        return usdAmount * ConversionRates.USD_TO_SEK_RATE;
    }
    public static double convertSEKToEuro(double sekAmount){
        return sekAmount * ConversionRates.SEK_TO_EURO_RATE;
    }
    public static double convertEuroToSEK(double euroAmount){
        return euroAmount * ConversionRates.EURO_TO_SEK_RATE;
    }
    public static double convertUSDToEuro(double usdAmount){
        return usdAmount * ConversionRates.USD_TO_EURO_RATE;
    }
    public static double convertEuroToUSD(double euroAmount){
        return euroAmount * ConversionRates.EURO_TO_USD_RATE;
    }
}
