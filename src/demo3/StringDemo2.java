package demo3;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("비밀번호를 입력하세요: ");
		String pwd1 = scanner.next();

		System.out.print("비밀번호를 다시 입력하세요: ");
		String pwd2 = scanner.next();
		
		System.out.println(pwd1 == pwd2);
		System.out.println(pwd1.equals(pwd2));
		
		scanner.close();		// 키보드의 입력을 읽어오는 Scanner객체는 컴퓨터의 자원을 점유하는데
								// close()를 실행하면 점유중인 자원을 해제시킨다.
	}
}
