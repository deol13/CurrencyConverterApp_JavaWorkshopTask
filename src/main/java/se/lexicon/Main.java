package se.lexicon;

public class Main {
    public static void main(String[] args) {
        boolean continueApp = true;
        while (continueApp){
            UserHandling.displayCurrencySelectionMenu();
            String input = UserHandling.inputFromUser();

            String amountStr = "";
            double amount = 0.0;
            double convertedAmount = 0.0;

            switch (input){
                case "1":
                    UserHandling.displayCurrencyConvertMenu("SEK", "USD", CurrencyConversion.sekToUSDRate);
                    amountStr = UserHandling.inputFromUser();
                    amount = Double.parseDouble(amountStr);
                    convertedAmount = CurrencyConversion.convertSEKToUSD(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 1);
                    break;
                case "2":
                    UserHandling.displayCurrencyConvertMenu("USD", "SEK", CurrencyConversion.usdToSEKRate);
                    amountStr = UserHandling.inputFromUser();
                    amount = Double.parseDouble(amountStr);
                    convertedAmount = CurrencyConversion.convertUSDToSEK(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 2);
                    break;
                case "3":
                    UserHandling.displayCurrencyConvertMenu("SEK", "Euro", CurrencyConversion.sekToEuroRate);
                    amountStr = UserHandling.inputFromUser();
                    amount = Double.parseDouble(amountStr);
                    convertedAmount = CurrencyConversion.convertSEKToEuro(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 3);
                    break;
                case "4":
                    UserHandling.displayCurrencyConvertMenu("Euro", "SEK", CurrencyConversion.euroToSEKRate);
                    amountStr = UserHandling.inputFromUser();
                    amount = Double.parseDouble(amountStr);
                    convertedAmount = CurrencyConversion.convertEuroToSEK(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 4);
                    break;
                case "5":
                    UserHandling.displayCurrencyConvertMenu("USD", "Euro", CurrencyConversion.usdToEuroRate);
                    amountStr = UserHandling.inputFromUser();
                    amount = Double.parseDouble(amountStr);
                    convertedAmount = CurrencyConversion.convertUSDToEuro(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 5);
                    break;
                case "6":
                    UserHandling.displayCurrencyConvertMenu("Euro", "USD", CurrencyConversion.euroToUSDRate);
                    amountStr = UserHandling.inputFromUser();
                    amount = Double.parseDouble(amountStr);
                    convertedAmount = CurrencyConversion.convertEuroToUSD(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 6);
                    break;
                case "0":
                    System.out.println("Exiting currency converter app.");
                    continueApp = false;
                    continue;
                default:
                    System.out.println("No valid menu choice made!");
                    break;
            }
            System.out.println("--------------------");
        }
    }


}