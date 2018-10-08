//HackerRank Day 8: Dictionaries & Maps
/* Task:
 * Given n names and phone numbers, assemble a phone book that maps 
 * friends' names to their respective phone numbers. 
 * You will then be given an unknown number of names to query your phone book for. 
 * For each name queried, print the associated entry from your 
 * phone book on a new line in the form name=phoneNumber; 
 * if an entry for name is not found, print Not found instead.
 */

import java.util.*;

public class Day8DicAndMaps {
	
	public static void main(String []argh){
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        HashMap<String, Integer> map = new HashMap<>();
    
        //add information to map
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        
        //see if name is in map
        while(in.hasNext()){
            String s = in.next();
            
            //if name is not in map
            if(map.get(s) == null) {
            	System.out.println("Not found");
            } else {
            	System.out.println(s + "=" + map.get(s));
            }  
        }
        in.close();
	}
	

}
