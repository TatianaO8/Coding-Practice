//HackerRank Day6: Let's Review
/* Task
 * Given a string, S, of length N that is indexed from 0 to N-1,
 * print its even-indexed and odd-indexed characters
 * as 2 space-separated strings on a single line
 */

//0 is considered an even index

import java.util.*;


public class Day6LetsReview {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTestCases = scanner.nextInt();
		scanner.nextLine();
		
		//go through each test case
		for(int i=0; i<numOfTestCases; i++) {
			
			String a = scanner.nextLine();	//read in string
			char arr[] = a.toCharArray();	//convert string to character array
			int lenA = arr.length;
			
			String odd = "";
			String even = "";
			
			//get even and odd positions for strings
			for(int j=0; j<lenA; j++) {	
				if(j%2 == 0) {
					even += arr[j]; 
				} else {
					odd += arr[j];
				}
			}
			
			System.out.println(even + " " + odd);
		}
		
	}

}
