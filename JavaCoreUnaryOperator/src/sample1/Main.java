package sample1;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 11, 16, 19, 24, 3);
		UnaryOperator<Integer> replaceOddWithZero = (n) -> (n % 2 != 0) ? 0 : n;
		 for (int i = 0; i < numbers.size(); i++) {
	            numbers.set(i, replaceOddWithZero.apply(numbers.get(i))); 
	        }
		 System.out.println(numbers);
	}

}
