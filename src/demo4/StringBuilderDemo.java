package demo4;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String title = "이것이 자바다";
		String writer = "신용권";
		int price = 30000;
		
		String text = "제목:" + title + ", 저자:" + writer + ", 가격:" + price;
		System.out.println(text);
		
		StringBuilder sb = new StringBuilder();		// 객체생성
		sb.append("제목:");							// 문자들을 입력
		sb.append(title);
		sb.append(", 저자:");
		sb.append(writer);
		sb.append(", 가격:");
		sb.append(price);
		
		String text2 = sb.toString();				// 문자열들을 한줄로 나열
		System.out.println(text2);
	}
}
