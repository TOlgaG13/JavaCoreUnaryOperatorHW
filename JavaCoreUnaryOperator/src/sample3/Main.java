package sample3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<List<String>> filterLongStrings = list -> {
			List<String> filteredList = new ArrayList<>();
			for (String s : list) {
				if (s.length() > 5) {
					filteredList.add(s);
				}
			}
			return filteredList;
		};
		List<String> strings = List.of("apple", "friend", "Java", "date","Around","amazing");

		List<String> result = filterLongStrings.apply(strings);

		System.out.println(result);
	}
}
