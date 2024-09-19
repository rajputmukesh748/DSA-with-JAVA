package Patterns;

import java.util.*;

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int number = scanner.nextInt();

        for(int i=0; i< number; i++){
            for(int j=0; j< number - i; j++){
                System.err.print(j+1 + " ");
            }
            System.err.println();
        }
    }
}
