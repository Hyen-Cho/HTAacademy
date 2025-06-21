package demo5;

import java.text.DecimalFormat;

public class FormaterDemo2 {

	public static void main(String[] args) {
		
		// DecimalFormat
		// 숫자를 원하는 형식의 문자열로 변환해주는 클래스
		// 패턴문자를 사용해서 원하는 문자열 형태를 지정할 수 있다.
		//		10000000	-> "10,000,000"		패턴 "#,###"
		//		10000000	-> "10,000,000"		패턴 "0,000"
		
		String pattern1 = "#,###";		// 10,000,000
		String pattern2 = "0,000";		// 10,000,000
		
		DecimalFormat df = new DecimalFormat(pattern2);
		String text = df.format(10000000);
		System.out.println(text);
		
		// 소수점에서 #은 0이면 표시안하고 0은 0도 표시한다
		// 소수점 2자리까지 표시해라.
		String pattern3 = "#,###.##";		// 1234.3001	->	1,234.3
											// 1234.3071	->	1,234,31
		String pattern4 = "0,000.00";		// 1234.3001	->	1,234.30
											// 1234.3071	->	1,234,31
		
		DecimalFormat df2 = new DecimalFormat(pattern4);
		String text2 = df2.format(1234.3001);
		System.out.println(text2);
	}
}
