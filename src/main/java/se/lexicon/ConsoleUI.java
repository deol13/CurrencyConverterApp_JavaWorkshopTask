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
        System.out.println("Currency Converter App:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("5. Convert USD to Euro");
        System.out.println("6. Convert Euro to USD");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }

    public static void displayCurrencyConvertMenu(String convertFrom, String convertTo, double rate){
        System.out.println("Converting from " + convertFrom + " to " + convertTo + " at rate: " + rate);
    }

    public static void displayConversion(double startingAmount, double endAmount, int converted) {
        String startCurrency = "";
        String endCurrency = "";

        switch (converted) {
            case 1:
                startCurrency = "SEK";
                endCurrency = "USD";
                break;
            case 2:
                startCurrency = "USD";
                endCurrency = "SEK";
                break;
            case 3:
                startCurrency = "SEK";
                endCurrency = "Euro";
                break;
            case 4:
                startCurrency = "Euro";
                endCurrency = "SEK";
                break;
            case 5:
                startCurrency = "USD";
                endCurrency = "Euro";
                break;
            case 6:
                startCurrency = "Euro";
                endCurrency = "USD";
                break;
            default:
                return;
        }

        System.out.println("Converted " + startingAmount + " " + startCurrency + " to " + endAmount + " " + endCurrency );
        System.out.println(dateAndTime());
    }

    private static String dateAndTime(){
        LocalDateTime dateAndTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("eeee dd MMM yyyy : HH:mm");
        return dateAndTime.format(format);
    }

    public static String inputFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
