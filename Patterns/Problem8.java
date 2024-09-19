package Patterns;

import java.util.*;;

// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter Max Line Number:- ");
        int number = scanner.nextInt();
        int printNumber = 1;

        for(int i=0; i<number; i++){
            for(int j=0; j < (i+1); j++){
                System.err.print(printNumber+ (printNumber < 10 ? "  " : " "));
                printNumber++;
            }
            System.err.println();
        }
    }
}
