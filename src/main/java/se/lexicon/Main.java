package se.lexicon;

public class Main {
    public static void main(String[] args) {
        boolean continueApp = true;
        while (continueApp){
            UserHandling.displayCurrencySelectionMenu();
            String input = UserHandling.inputFromUser();

            double convertedAmount = 0.0;
            double amount = 0.0;

            switch (input){
                case "1":
                    amount = takeAmountFromUser("SEK", "USD", CurrencyConversion.sekToUSDRate);
                    convertedAmount = CurrencyConversion.convertSEKToUSD(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 1);
                    break;
                case "2":
                    amount = takeAmountFromUser("USD", "SEK", CurrencyConversion.usdToSEKRate);
                    convertedAmount = CurrencyConversion.convertUSDToSEK(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 2);
                    break;
                case "3":
                    amount = takeAmountFromUser("SEK", "Euro", CurrencyConversion.sekToEuroRate);
                    convertedAmount = CurrencyConversion.convertSEKToEuro(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 3);
                    break;
                case "4":
                    amount = takeAmountFromUser("Euro", "SEK", CurrencyConversion.euroToSEKRate);
                    convertedAmount = CurrencyConversion.convertEuroToSEK(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 4);
                    break;
                case "5":
                    amount = takeAmountFromUser("USD", "Euro", CurrencyConversion.usdToEuroRate);
                    convertedAmount = CurrencyConversion.convertUSDToEuro(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 5);
                    break;
                case "6":
                    amount = takeAmountFromUser("Euro", "USD", CurrencyConversion.euroToUSDRate);
                    convertedAmount = CurrencyConversion.convertEuroToUSD(amount);
                    UserHandling.displayConversion(amount, convertedAmount, 6);
                    break;
                case "0":
                    System.out.println("Exiting currency converter app.");
                    continueApp = false;
                    continue;
                default:
                    System.out.println("Error: No valid menu choice made!");
                    break;
            }
            System.out.println("--------------------");
        }
    }

    public static double takeAmountFromUser(String convertFrom, String convertTo, double rate){
        double amount = 0.0;
        boolean continueAskForAmount = true;
        while (continueAskForAmount){
            UserHandling.displayCurrencyConvertMenu(convertFrom, convertTo, rate);
            String amountStr = UserHandling.inputFromUser();
            try{
                amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    System.out.println("Error: Only positive numbers allowed!\n");
                    continue;
                }
                continueAskForAmount = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Only numbers valid as input!\n");
            }
        }
        return amount;
    }
}