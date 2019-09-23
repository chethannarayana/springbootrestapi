//package startcoding.springbootrest.model;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SimpleAddition {
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		// TODO Auto-generated method stub
//		List<String> number = new ArrayList<>();
//		System.out.println("Enter number of test cases");
//		// Scanner scanner = new Scanner(System.in);
//		try {
//
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			int numberOfTestCases = Integer.parseInt(br.readLine());
//			if (numberOfTestCases <= 0 || numberOfTestCases >= 100)
//				throw new IllegalArgumentException("Only Positive Numbers & and Range is between 1 - 100");
//			System.out.println("Enter inpt one by one " + numberOfTestCases);
//			for (int i = 0; i < numberOfTestCases; i++) {
//				String temp = br.readLine();
//				number.add(temp.replaceAll("\\s", ""));
//			}
//
//			// number.remove(0);
//			number.forEach((p) -> {
//				int num = Integer.parseInt(p);
//				int sum = 0;
//				while (num != 0) {
//					sum = sum + num % 10;
//					num = num / 10;
//				}
//				System.out.println(sum);
//			});
//		} catch (NumberFormatException ne) {
//			System.out.println("Please enter valid input , " + ne.getMessage() + " Wrong input accepted is integer");
//		} catch (IllegalArgumentException ia) {
//			System.out.println(ia.getMessage());
//		}
//	}
//
//}
