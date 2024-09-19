package Patterns;

import java.util.*;

/**
 * InvertedRotatedHalfPyramid
 */
public class Problem5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter Number:- ");
        int number = scanner.nextInt();

        for(int i=0; i<number; i++){
            for(int j=0; j<5; j++){
                if (j < 5-(i+1)) {
                    System.err.print("  ");
                } else {
                    System.err.print("* ");
                }
            }
            System.err.println();
        }
    }
}