package buzz;

import java.util.ArrayList;
import java.util.List;

public class PrintFizzBuzzFunction {
    public List<String> fizzBuzz(int n) {
        // Making a list
        List<String> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            // If multiples of three or five
            if(i % 15 == 0){
                list.add("FizzBuzz");
            } else if (i % 3 == 0){ // Multiples of three
                list.add("Fizz");
            } else if (i % 5 == 0){ // Multiples of five
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        
        return list;
    }
}
