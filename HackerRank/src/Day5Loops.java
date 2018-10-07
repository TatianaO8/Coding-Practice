//HackerRank Day5:Loops
/* Task:
 * Given an integer, , print its first 10 multiples. 
 * Each multiple n x i (where 1<=i<=10) should be printed on a new 
 * line in the form: n x i = result.
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5Loops {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        for(int i=1; i<11; i++) {
        	int multiple = n*i;
        	System.out.println(n + " x " + i + " = " + multiple);
        }
    }

}
