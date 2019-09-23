package startcoding.springbootrest.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		Map<Integer, Integer> duplicateMap = new HashMap<Integer, Integer>();
		try (Scanner scan = new Scanner(System.in)) {
			int num = scan.nextInt();
			if (num >= 1 && num <= 10000) {
				for (int i = 0; i < num; i++) {
					int temp = scan.nextInt();
					if (temp >= 1 && temp <= 1000) {
						arrList.add(temp);
					} else {
						throw new IllegalArgumentException("Range of accepted input is between 1 - 1000");
					}
				}
				int duplicteCount = 0;
				for (Integer element : arrList) {
					if (duplicateMap.containsKey(element)) {
						int value = duplicateMap.get(element);
						duplicateMap.put(element, ++value);
						duplicteCount++;
					} else {
						duplicateMap.put(element, 1);
					}
				}
				System.out.println(duplicteCount);
			} else {
				throw new IllegalArgumentException("Range of accepted input is between 1 - 10000");
			}
		} catch (InputMismatchException nf) {
			System.out.println("Invalid input only numbers are accepted");
		} catch (IllegalArgumentException ia) {
			System.out.println(ia.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
