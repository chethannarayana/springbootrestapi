//package startcoding.springbootrest.model;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.Scanner;
//
//public class Pyramid {
//
//	static class Holder {
//		private String data;
//		private int height;
//		private int directrion;
//
//		public Holder(String data, int height, int directrion) {
//			super();
//			this.data = data;
//			this.height = height;
//			this.directrion = directrion;
//		}
//
//	}
//
//	public static void main(String[] args) {
//
//		List<Holder> holderList = new ArrayList<>();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		// TODO Auto-generated method stub
//		System.out.println("Enter number of test cases");
//		try (Scanner scan = new Scanner(System.in)) {
//			int testCase = scan.nextInt();
//
//			if (testCase >= 1 && testCase <= 256) {
//				for (int testCaseIndex = 0; testCaseIndex < testCase; testCaseIndex++) {
//					String temp = br.readLine();
//					System.out.println(temp + "before modifying");
//					// temp = temp.replaceAll("\\s", "|");
//					String[] tempHolder = temp.split("\\s");
//					if (tempHolder.length == 3) {
//						String tempData = tempHolder[0];
//						int tempHeight = Integer.parseInt(tempHolder[1]);
//						int tempDirection = Integer.parseInt(tempHolder[2]);
//						if ((tempData.length() >= 1 && tempData.length() <= 16) && (tempHeight >= 1 && tempHeight <= 18)
//								&& (tempDirection == 1 || tempDirection == -1)) {
//
//							holderList.add(new Holder(tempData, tempHeight, tempDirection));
//						} else {
//							throw new IllegalArgumentException("Range of accepted input is problem");
//						}
//					} else {
//						throw new IllegalArgumentException("There should be minimum 3 inputs");
//					}
//				}
//				for (Holder holder : holderList) {
//					if (holder.directrion == 1) {
//						for (int index = 1; index <= holder.height; index++) {
//							System.out.println("\n");
//							for (int space = index; space <= holder.height; space++) {
//								System.out.print(" ");
//							}
//							for (int contentIndex = 1; contentIndex <= (index + (index - 1)); contentIndex++) {
//								System.out.print(holder.data);
//							}
//
//						}
//					} else {
//						for (int index = 1; index <= holder.height; index++) {
//							System.out.println("\n");
//							for (int space = 1; space <= index; space++) {
//								System.out.print(" ");
//							}
//							for (int contentIndex = (holder.height + (holder.height - 1)); contentIndex >= index; contentIndex--) {
//								System.out.print(holder.data);
//							}
//
//						}
//					}
//
//				}
//
//			} else {
//				throw new IllegalArgumentException("Range of accepted input is between 1 - 256");
//			}
//		} catch (InputMismatchException nf) {
//			System.out.println("Invalid input only numbers are accepted");
//		} catch (IllegalArgumentException ia) {
//			System.out.println(ia.getMessage());
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//
//}
