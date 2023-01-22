package games;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args) {
        int amountOfPennies;
        int amountOfNickels;
        int amountOfDimes;
        int amountOfQuarters;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar'! Your goal is to");
        System.out.println("enter enough change to make exactly $1.00");
        System.out.println("Enter your number of pennies:");
        amountOfPennies = scanner.nextInt();
        System.out.println("Enter your number of nickels:");
        amountOfNickels = scanner.nextInt();
        System.out.println("Enter your number of dimes");
        amountOfDimes = scanner.nextInt();
        System.out.println("Enter your number of quarters");
        amountOfQuarters = scanner.nextInt();

        result = 0.01 * amountOfPennies + 0.05 * amountOfNickels + 0.1 * amountOfDimes + 0.25 * amountOfQuarters;

        if(result == 1){
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
        else if(result < 1){
            System.out.println("Sorry, you're " + (1-result) + " short of a dollar.");
        }
        else if(result > 1){
            System.out.println("Sorry, you're " + (result-1) + " over a dollar.");
        }
    }
}
