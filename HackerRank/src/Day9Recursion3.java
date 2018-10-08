//HackerRank Day 9: Recursion 3
/* Task:
 * Write a factorial function that takes a positive integer, N
 * as a parameter and prints the result of N!(N factorial).
 */

import java.io.*;
import java.util.*;


public class Day9Recursion3 {
    // Complete the factorial function below.
    static int factorial(int n) {
    	if(n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        int n = scanner.nextInt();
        scanner.close();

        int result = factorial(n);

        System.out.println(n + " factorial = " + result);
    }

}
