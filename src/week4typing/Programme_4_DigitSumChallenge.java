package week4typing;

import java.util.Scanner;

public class Programme_4_DigitSumChallenge {
    public static int sumDigits(int number) {
        if (number >= 10) {
            int digit, sum = 0;
            while (number > 0) {
                //finds the last digit of the given number
                digit = number % 10;
                //adds last digit to the variable sum
                sum = sum + digit;
                //removes the last digit from the number
                number = number / 10;
            }
            return sum;
        } else {
            //return -1 for negative numbers And one number
            return -1;
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number = : ");
        int result = sumDigits(scanner.nextInt());
        System.out.println("Sum of number digits is: " + result);
        // closing the scanner object
        scanner.close();
    }
}



