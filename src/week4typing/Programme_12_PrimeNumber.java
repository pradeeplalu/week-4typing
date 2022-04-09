package week4typing;

import java.util.Scanner;

public class Programme_12_PrimeNumber {
    public static void isPrimeNumber(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        isPrimeNumber(a);
        // closing the scanner object
        scanner.close();
    }
}

