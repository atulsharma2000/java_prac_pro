package day11_stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class lambda2 {
	// lambda expressions are referenced by functional interface reference.
	// lambda arg scope is limited to lambda expression body/implementation.
	
	
	public static void main1(String[] args) {
	
 	}
	
	
	
	public static void main(String[] args) {
		int z=10;
		
		BinaryOperator<Integer> op1 = (x,y) -> x+y;
		BinaryOperator<Integer> op2 = (x,y) -> x+y+z;
		
		int a = 2, b=7;
		
		int r = op1.apply(a, b);
		int f  = op2.apply(a, b);
		System.out.println(r+" "+f);
		
		System.out.println();
		
		calc(20,30,(x,y)-> x*y*x);
	}



	private static void calc(int x, int y, BinaryOperator<Integer> op) {
		int res = op.apply(x,y);
	}

}
