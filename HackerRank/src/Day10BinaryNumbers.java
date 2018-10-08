//HackerRank Day 10: Binary Numbers
/* Task:
 * Given a base-10 integer, n, convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum number of 
 * consecutive 1's in n's binary representation.
 */

import java.util.*;

public class Day10BinaryNumbers {
	
	public static String reverseInt(String result) {
		String reverse = "";
		
		char[] arr = result.toCharArray();
		
		for(int i=arr.length-1; i>=0; i--) {
			reverse += Character.toString(arr[i]);
		}
		
		return reverse;
	}
	
	public static String integerToBinary(int base10) {
		
		String result = "";
		
		int remainder = 0;
		int quotient = base10;
		
		while(quotient !=0) {
			remainder = quotient % 2;
			quotient /= 2;
			
			//System.out.println("quotient: " + quotient + " remainder: " + remainder);
			
			result += Integer.toString(remainder);
		}
		
		result = reverseInt(result);
		return result;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int base10 = scanner.nextInt();
		//System.out.println("Integer: " + base10);
		scanner.close();
		
		String binF = integerToBinary(base10);
		
		//System.out.println("IntegerToBinary: " + binF);
		
		char[] arr = binF.toCharArray();	//convert to char array
		
		//find out the longest streak of 1s
		int max = 0;
		int count = 0;
		boolean isOne = false;
		for(int i=0; i<arr.length; i++) {
			//System.out.println("array: " + arr[i] + " count: " + count + " max: " + max);
			
			if(arr[i] == '1' && isOne == true) {
				count++;
			}
			
			if(arr[i] == '1' && isOne == false) {
				count++;
				isOne = true;
			}
			
			if(arr[i] == '0'){
		
				isOne = false;
				count = 0;
			}
			
			if(count > max)
				max = count;
		}
		
		
		System.out.println(max);
		
		

	}

}
