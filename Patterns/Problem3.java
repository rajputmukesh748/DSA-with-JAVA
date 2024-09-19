package Patterns;

import java.util.Scanner;

// *
// * *
// * * *
// * * * *

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter number for print Half Pyramid: ");
        int number = scanner.nextInt();

        for(int i=0; i<number; i++){
             for(int j=0; j<=i; j++){
                System.out.print("* ");
             }
             System.out.println();
        }
    }
}
