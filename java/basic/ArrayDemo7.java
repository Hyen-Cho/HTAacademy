import java.util.Scanner;

public class ArrayDemo7 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// scanner.next() -> 문자열을 읽어온다.
		System.out.print("이름 입력> ");
		String name = scanner.next();
		
		// scanner.nextInt() -> 숫자를 읽어온다.
		System.out.print("나이 입력> ");
		int age = scanner.nextInt();
		
		System.out.print("연락처 입력> ");
		String tel = scanner.next();
		
		// scanner.nextDouble() -> 실수를 읽어온다.
		System.out.print("몸무게 입력> ");
		double weight = scanner.nextDouble();
		
		System.out.println();
		System.out.println("이름 " + name);
		System.out.println("나이 " + age);
		System.out.println("연락처 " + tel);
		System.out.println("몸무게 " + weight);
	}
}