//HackerRank Day7: Arrays
/* Task:
 * Given an Array, A, of N integers, print A's 
 * elements in reverse order as a single line of 
 * space-separated numbers. 
 */

import java.util.*;

public class Day7Arrays {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();
        
        for(int i = arr.length-1; i>=0; i--) {
        	System.out.print(arr[i] + " ");	
        }
    }

}
