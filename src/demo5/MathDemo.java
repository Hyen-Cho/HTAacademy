package demo5;

public class MathDemo {

	public static void main(String[] args) {
		
		double result1 = Math.ceil(3.1);
		double result2 = Math.ceil(4.0);
		double result3 = Math.ceil(3.9);
		System.out.println(result1);		// 4.0
		System.out.println(result2);		// 4.0
		System.out.println(result3);		// 4.0
		
		double result4 = Math.floor(3.1);
		double result5 = Math.floor(3.0);
		double result6 = Math.floor(3.9);
		System.out.println(result4);		// 3.0
		System.out.println(result5);		// 3.0
		System.out.println(result6);		// 3.0
		
		double result7 = Math.round(3.1);
		double result8 = Math.round(3.0);
		double result9 = Math.round(3.9);
		System.out.println(result7);		// 3.0
		System.out.println(result8);		// 3.0
		System.out.println(result9);		// 4.0
		
		
	}
}
