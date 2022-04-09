package week4typing;

import java.util.Scanner;

public class Programme_6_NumberTriangle {
    public static void numTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        //calls static method
        numTriangle(scanner.nextInt());
        // closing the scanner object
        scanner.close();
    }
}



