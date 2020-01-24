package buzz;

public class Main {
	public static void main(String[] args) {
		int n = 15;
		
		System.out.println("Input: " + n);
		
		PrintFizzBuzzFunction solution = new PrintFizzBuzzFunction();
		
		System.out.println("Solution: " + solution.fizzBuzz2(n));
	}
}
