package buzz;

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
    		} else if (i % 3 == 0){
    			result.add("Fizz");
    		} else if (i % 5 == 0){
    			result.add("Buzz");
    		} else {
    			result.add(String.valueOf(i));
    		}
    	}
    	
    	return result;
    }
}
