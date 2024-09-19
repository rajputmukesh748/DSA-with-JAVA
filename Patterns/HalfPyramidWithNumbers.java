package Patterns;

import java.util.*;


/**
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

public class HalfPyramidWithNumbers {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.err.print("Enter Number:- ");
           int number = scanner.nextInt();

           for(int i=0; i<number; i++){
            for(int j=0; j< i+1 ; j++){
                System.err.print(j+1 + " ");
            }
            System.err.println();
           }
    }
}
