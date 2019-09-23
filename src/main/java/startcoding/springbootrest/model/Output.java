//package startcoding.springbootrest.model;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.function.DoubleBinaryOperator;
//
//class Recussion {
//	int fact(int n) {
//		int result;
//		if (n == 1)
//			return 1;
//		result = fact(n - 1) * n;
//		return result;
//	}
//}
//
//enum Operation {
//	PLUS("+", (x, y) -> x + y), MINUS("-", (x, y) -> x - y), TIMES("*", (x, y) -> x * y), DIVIDE("/", (x, y) -> x / y);
//
//	private final String symbol;
//	private final DoubleBinaryOperator op;
//
//	Operation(String symbol, DoubleBinaryOperator op) {
//		this.symbol = symbol;
//		this.op = op;
//	}
//
//	@Override
//	public String toString() {
//		return symbol;
//	}
//
//	public double apply(double x, double y) {
//		return op.applyAsDouble(x, y);
//	}
//}
//
//public class Output {
//	public static void main(String[] args) {
//
//		final Comparator<String> COMPARATOR = Comparator.comparingInt(String::length);
//		Recussion re = new Recussion();
//		System.out.println(re.fact(1));
//		Operation.PLUS.apply(23.4d, 34.5d);
//		List<String> words = new ArrayList();
//		
//
//		words.add("Chethan");
//		words.add("Jack");
//		words.add("Anthony");
//
//		words.sort(COMPARATOR);
//		System.out.println(words);
//	}
//
//}
