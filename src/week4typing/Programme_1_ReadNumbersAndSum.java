package week4typing;

import java.util.Scanner;

public class Programme_1_ReadNumbersAndSum {
    public static void ReadTenNumbersAndSum() {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        // closing the scanner object
        scanner.close();
    }

    public static void main(String[] args) {
        ReadTenNumbersAndSum();
    }
}



