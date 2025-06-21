package demo4;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		// StringTokenizer는 import 생성해야 한다.
		StringTokenizer st = new StringTokenizer("김유신 강감찬 이순신 홍길동");
		
		int count = st.countTokens();
		System.out.println("토큰갯수 : " + count);
		
		// while 문 사용하기
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		}
		
		StringTokenizer st2 = new StringTokenizer("100,20,50,28,59,9,17,83", ",");
		int total = 0;
		while (st2.hasMoreTokens()) {
			String value = st2.nextToken();			// 토큰 추출 "100"
			int num = Integer.parseInt(value);		// 숫자로 변환 100
			total += num;							// total에 누적
		}

		System.out.println(total);
		
		String text = "홍길동,010-1111-1111,,중앙HTA";
		
		String[] values = text.split(",");
		StringTokenizer st3 = new StringTokenizer(text, ",");
		
		System.out.println("배열의 길이 :" + values.length);
		System.out.println("토큰의 길이 :" + st3.countTokens());
		
	}
}
