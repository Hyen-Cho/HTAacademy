package demo3;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이메일을 입력하세요: ");
		String email = scanner.next();
		
		int endIndex = email.indexOf("@");
		String id = email.substring(0, endIndex);
		System.out.println("아이디: " + id);
		
		scanner.close();
	}
}
