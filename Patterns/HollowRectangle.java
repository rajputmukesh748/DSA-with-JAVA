package Patterns;

import java.util.Scanner;

// * * * * *
// *       *
// *       *
// *       *
// * * * * *

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        for(int i=0; i<number; i++){
            for(int j=0; j<number; j++){
                if (i == 0 || i == (number - 1) || j == 0 || j == (number - 1)) {
                    System.err.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
