package leetcode412;

import java.util.ArrayList;
import java.util.List;

public class PrintFizzBuzzFunction {
    public List<String> fizzBuzz(int n) {
        // Make a list of string
    	List<String> result = new ArrayList<>();
    	
    	// O(n) no matter what
    	for(int i = 1; i <= n; i++){
    		// If its divided by 3 or 5, means divided by 15
    		if(i % 15 == 0){
    			result.add("FizzBuzz");
    		} else if (i % 3 == 0){ // If its divided by 3
    			result.add("Fizz");
    		} else if (i % 5 == 0){ // If its divided by 5
    			result.add("Buzz");
    		} else { // or use "" + 3
    			result.add(String.valueOf(i));
    		}
    	}
    	
    	return result;
    }
    
    // Another way to do it, pretty cool
    public List<String> fizzBuzz2(int n){
    	List<String> result = new ArrayList<>();
    	
    	for(int i = 1, fizz = 0, buzz = 0; i <= n; i++){
    		// Update the values
    		fizz++;
    		buzz++;
    		
    		// This should be the first if statement or else we don't know if its only divided by 3 or 5
    		// Same as i % 15 == 0
    		if(fizz == 3 && buzz == 5){
    			result.add("FizzBuzz");
    			
    			// Reset them back to zero to count again
    			fizz = 0;
    			buzz = 0;
    		} else if (fizz == 3){
    			result.add("Fizz");
    			
    			fizz = 0;
    		} else if (buzz == 5){
    			result.add("Buzz");
    			
    			buzz = 0;
    		} else {
    			result.add(String.valueOf(i));
    		}
    	}
    	
    	return result;
    }
}
