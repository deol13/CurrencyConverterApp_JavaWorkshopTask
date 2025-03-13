package se.lexicon;

import java.util.Scanner;

public class CurrencyConverterApp {

    public static void main(String[] args) {
        boolean continueApp = true;
        while (continueApp){
            ConsoleUI.displayCurrencySelectionMenu();
            ConsoleUI.displayCurrencyRates();
            String input = ConsoleUI.getMenuChoice();
            continueApp = performOperators(input);

            // Gives the user a chance to read the results before the menu shows up again.
            System.out.println("Press \"ENTER\" to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
    }

    public static boolean performOperators(String menu){
        boolean continueApp = true;
        double sekAmount = 0.0;
        double usdAmount = 0.0;
        double euroAmount = 0.0;

        switch (menu){
            case "1":
                sekAmount = getAmountFromUser("SEK", "USD", ConversionRates.SEK_TO_USD_RATE);
                usdAmount = CurrencyConversion.convertSEKToUSD(sekAmount);
                ConsoleUI.displayConversionResult(sekAmount, usdAmount, "SEK", "USD");
                break;
            case "2":
                usdAmount = getAmountFromUser("USD", "SEK", ConversionRates.USD_TO_SEK_RATE);
                sekAmount = CurrencyConversion.convertUSDToSEK(usdAmount);
                ConsoleUI.displayConversionResult(usdAmount, sekAmount, "USD", "SEK");
                break;
            case "3":
                sekAmount = getAmountFromUser("SEK", "Euro", ConversionRates.SEK_TO_EURO_RATE);
                euroAmount = CurrencyConversion.convertSEKToEuro(sekAmount);
                ConsoleUI.displayConversionResult(sekAmount, euroAmount, "SEK", "Euro");
                break;
            case "4":
                euroAmount = getAmountFromUser("Euro", "SEK", ConversionRates.EURO_TO_SEK_RATE);
                sekAmount = CurrencyConversion.convertEuroToSEK(euroAmount);
                ConsoleUI.displayConversionResult(euroAmount, sekAmount, "Euro", "SEK");
                break;
            case "5":
                usdAmount = getAmountFromUser("USD", "Euro", ConversionRates.USD_TO_EURO_RATE);
                euroAmount = CurrencyConversion.convertUSDToEuro(usdAmount);
                ConsoleUI.displayConversionResult(usdAmount, euroAmount, "USD", "Euro");
                break;
            case "6":
                euroAmount = getAmountFromUser("Euro", "USD", ConversionRates.EURO_TO_USD_RATE);
                usdAmount = CurrencyConversion.convertEuroToUSD(euroAmount);
                ConsoleUI.displayConversionResult(euroAmount, usdAmount, "Euro", "USD");
                break;
            case "0":
                System.out.println("Exiting currency converter app.");
                continueApp = false;
                break;
            default:
                System.out.println("Error: No valid menu choice made!");
                break;
        }
        return continueApp;
    }

    public static double getAmountFromUser(String convertFrom, String convertTo, double rate){
        double amount = 0.0;
        boolean continueAskForAmount = true;
        while (continueAskForAmount){
            ConsoleUI.displayCurrencyConvertMenu(convertFrom, convertTo, rate);
            String amountStr = ConsoleUI.getAmount(convertFrom);
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
