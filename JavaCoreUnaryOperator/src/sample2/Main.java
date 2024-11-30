package sample2;

import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<String> removeNonDigits = s -> s.replaceAll("[^0-9]", "");
		 String input = "text1 Text2 line2Text3 4String5Build";
	        String result = removeNonDigits.apply(input);
	        System.out.println(result);
	}

}
