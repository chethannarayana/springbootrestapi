//package startcoding.springbootrest.model;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class WinningGame {
//
//	public static void main(String[] args) {
//		int playersStrength[] = new int[1000];
//		int villansStrength[] = new int[1000];
//		int highestVillanStrength = 0;
//		int highestPlayerStrength = 0;
//		try (Scanner scan = new Scanner(System.in)) {
//			int numberOfRounds = scan.nextInt();
//			if (numberOfRounds >= 1 && numberOfRounds <= 10) {
//				for (int outerIndex = 0; outerIndex < numberOfRounds; outerIndex++) {
//					int numberOfPlyrs = scan.nextInt();
//					if (numberOfPlyrs >= 1 && numberOfPlyrs <= 1000) {
//						highestVillanStrength = calculcateHighestEnergy(numberOfPlyrs, villansStrength, scan);
//						highestPlayerStrength = calculcateHighestEnergy(numberOfPlyrs, playersStrength, scan);
//						System.out.println((highestPlayerStrength > highestVillanStrength ? "WIN" : "LOSE"));
//					} else {
//						throw new IllegalArgumentException("Range of accepted input for Players between 1 - 1000");
//					}
//				}
//			} else {
//				throw new IllegalArgumentException("Range of accepted input for Team/Test is between 1 - 10");
//			}
//		} catch (IllegalArgumentException ia) {
//			System.out.println(ia.getMessage());
//		} catch (InputMismatchException nf) {
//			System.out.println("Invalid input only numbers are accepted");
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//
//	private static int calculcateHighestEnergy(int numberOfPlyrs, int[] StrengthArry, Scanner scan)
//			throws IllegalArgumentException {
//
//		int highestStrength = 0;
//		for (int number = 0; number < numberOfPlyrs; number++) {
//			StrengthArry[number] = scan.nextInt();
//			// playersStrength[number] = scan.nextInt();
//			if (StrengthArry[number] >= 1 && StrengthArry[number] <= 100000) {
//
//				if (number == 0) {
//					highestStrength = StrengthArry[number];
//
//				} else {
//					highestStrength = StrengthArry[number] > highestStrength ? StrengthArry[number] : highestStrength;
//				}
//			} else {
//				throw new IllegalArgumentException("Range of accepted input for Energy is between 1 - 100000");
//			}
//		}
//		return highestStrength;
//	}
//}
