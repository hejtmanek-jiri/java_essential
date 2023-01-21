package games;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args) {
        String seasonOfTheYear = "";
        int wholeNumber = 0;
        String adjective = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type season of the year:");
        seasonOfTheYear = scanner.next();

        System.out.println("Type a whole number");
        wholeNumber = scanner.nextInt();

        System.out.println("Type a adjective");
        adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + seasonOfTheYear + " day,");
        System.out.println("I drink a minimum of " + wholeNumber + " cups");
        System.out.println("of coffee.");

    }

}
