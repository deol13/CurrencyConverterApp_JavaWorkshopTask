package se.lexicon;

/**
 * Helper class for converting currency
 * */
public class CurrencyConversion {
    public static double sekToUSDRate = 0.099; //Per 1 sek you get 0.099 USD
    public static double usdToSEKRate = 10.13;
    public static double sekToEuroRate = 0.091;
    public static double euroToSEKRate = 11.03;
    public static double usdToEuroRate = 0.92;
    public static double euroToUSDRate = 1.09;


    public static double convertSEKToUSD(double amount){
        return amount * sekToUSDRate;
    }
    public static double convertUSDToSEK(double amount){
        return amount * usdToSEKRate;
    }
    public static double convertSEKToEuro(double amount){
        return amount * sekToEuroRate;
    }
    public static double convertEuroToSEK(double amount){
        return amount * euroToSEKRate;
    }
    public static double convertUSDToEuro(double amount){
        return amount * usdToEuroRate;
    }
    public static double convertEuroToUSD(double amount){
        return amount * euroToUSDRate;
    }
}
