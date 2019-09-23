//package startcoding.springbootrest.model;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Vector;
//
//public class HighestDigistSeq {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		 Vector<String> arr; 
//	        arr = new Vector<>(); 
//	          
//	        //output should be 6054854654 
//	        arr.add("1"); 
//	        arr.add("34"); 
//	        arr.add("3"); 
//	        arr.add("98");
//	        arr.add("9");
//	        arr.add("76");
//	        arr.add("45");
//	        arr.add("4");
//		
//	//	String[] arr = { "1", "34", "3", "98", "9", "76", "45", "4" };
//		
//		
//		
//		
//		Collections.sort(arr,Comparator.reverseOrder());
//		
//	
//		
//		Collections.sort(arr, new Comparator<String>() {
//
//			@Override
//			public int compare(String X, String Y) {
//				// first append Y at the end of X 
//		        String XY=X + Y; 
//		          
//		        // then append X at the end of Y 
//		        String YX=Y + X; 
//		          
//		        // Now see which of the two formed numbers  
//		        // is greater 
//		        return XY.compareTo(YX) > 0 ? -1:1; 
//			}
//			
//			
//		});
//		
//		Collections.sort(arr,(String X, String Y) ->{
//			 String XY=X + Y; 
//	          
//		        // then append X at the end of Y 
//		        String YX=Y + X; 
//		          
//		        // Now see which of the two formed numbers  
//		        // is greater 
//		        return XY.compareTo(YX) > 0 ? -1:1;
//		});
//		
//		
//		System.out.println(arr.toString());
//
//	}
//
//}
