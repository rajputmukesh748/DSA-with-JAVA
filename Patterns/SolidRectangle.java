package Patterns;

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

import java.util.*;

class SolidRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many number of rows you want : ");
        int number = input.nextInt();

        for(int i = 0; i < number; i++){
            for(int j = 0; j < 5; j++){
                System.err.print("* ");
            }
            System.err.println();
        }

    }
}