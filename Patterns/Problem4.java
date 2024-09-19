package Patterns;

import java.util.Scanner;

// * * * *
// * * *
// * *
// *

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for print Inverted Half Pyramid: ");
        int number = scanner.nextInt();

        for(int i=0; i<number; i++){
            for(int j=number; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
