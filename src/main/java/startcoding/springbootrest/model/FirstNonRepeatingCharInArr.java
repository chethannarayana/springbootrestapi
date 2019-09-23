package startcoding.springbootrest.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharInArr {

	public static void main(String[] args) {

		String arr = "ssuupxpeesrzr";
		char[] arrChar = arr.toCharArray();

		Map<Character, Integer> characterMap = new LinkedHashMap<>();

		for (int index = 0; index < arr.length(); index++) {

			if (characterMap.containsKey(arrChar[index])) {
				int count = characterMap.get(arrChar[index]) + 1;
				characterMap.put(arrChar[index], count++);
			} else {
				characterMap.put(arrChar[index], 1);
			}

		}

		System.out.println("Ouput" + characterMap);
		Boolean found = false;
		characterMap.entrySet().stream().filter(ch -> ch.getValue() == 1).findFirst();
		//characterMap.entrySet().stream().filter(ch -> ch == 1).findFirst();
		System.out.println("found " + characterMap.keySet().stream().map(ch -> ch == 1).findFirst());
		for (Character ch : characterMap.keySet()) {
			if (characterMap.get(ch) == 1) {
				found = true;
				System.out.println("First Non repeated Character is " + ch);
				break;
			}
		}
		if (!found) {
			System.out.println("All character are duplicated");
		}

	}

}
