package Exercises;

import java.util.Scanner;

/**
 * FirstExercise
 */
public class FirstExercise {

    public void main(String[] args) {
        question2();
    }


    //Enter 3 numbers from the user & make a function to print their average.
    public void question1(){
        System.err.println("Enter 3 numbers from the user & make a function to print their average.");
        int first, second, third;
       
        Scanner firstSc = new Scanner(System.in);
        System.err.print("Enter first number: ");
        first = firstSc.nextInt();

        Scanner secondSc = new Scanner(System.in);
        System.err.print("Enter second number: ");
        second = secondSc.nextInt();

        Scanner thirdSc = new Scanner(System.in);
        System.err.print("Enter third number: ");
        third = thirdSc.nextInt();


        int average = (first + second + third) / 3;
        System.err.println("Average of all entered numbers are : "+average);
        System.err.println();

    }


    //Write a function to print the sum of all odd numbers from 1 to n.
    public void question2(){
        System.err.println("Write a function to print the sum of all odd numbers from 1 to n.");
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i <= n; i++){
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.err.println("Sum of all odd numbers are: "+sum);
        System.err.println();
    }

    
}