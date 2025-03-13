package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Helper class for handling input from user and output to user.
 * Display menu.
 * Handle input from user.
 * */
public class ConsoleUI {

    public static void displayCurrencySelectionMenu() {
        System.out.println("----------------------------");
        System.out.println("Currency Converter App:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("5. Convert USD to Euro");
        System.out.println("6. Convert Euro to USD");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
    }

    public static void displayCurrencyRates(){
        System.out.println("----------------------------");
        System.out.println("Exchange rates as of " + dateAndTime()+ " :");
        System.out.println("## SEK = " + ConversionRates.SEK_TO_USD_RATE + " USD");
        System.out.println("## USD = " + ConversionRates.USD_TO_SEK_RATE + " SEK");
        System.out.println("## SEK = " + ConversionRates.SEK_TO_EURO_RATE + "Euro");
        System.out.println("## Euro = " + ConversionRates.EURO_TO_SEK_RATE + "SEK");
        System.out.println("## USD = " + ConversionRates.USD_TO_EURO_RATE + "Euro");
        System.out.println("## Euro = " + ConversionRates.EURO_TO_USD_RATE + "USD");
        System.out.println("----------------------------");
    }

    public static void displayCurrencyConvertMenu(String convertFrom, String convertTo, double rate){
        System.out.println("Converting from " + convertFrom + " to " + convertTo + " at rate: " + rate);
    }

    public static void displayConversionResult(double startingAmount, double endAmount, String startCurrency, String endCurrency) {
        System.out.println(startingAmount + " " + startCurrency + " = " + endAmount + " " + endCurrency );
    }

    public static String getAmount(String currency) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in " + currency + ": ");
        return scanner.nextLine();
    }
    public static String getMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice:");
        return scanner.nextLine();
    }

    private static String dateAndTime(){
        LocalDateTime dateAndTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("eeee dd MMM yyyy HH:mm");
        return dateAndTime.format(format);
    }
}
