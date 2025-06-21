public class OpDemo2 {
	public static void main(String[] args) {
		// 숫자 + 숫자 -----> 덧셈
		// 문자열 + 문자열 ----> 이어붙이기
		// 문자열 + 숫자 -----> 이어붙이기
		// 숫자 + 문자열 -----> 이어붙이기
	

		String str1 = "서울특별시";
		String str2 = " 종로구 봉익동";
		String str3 = str1 + str2;			// 서울특별시 종로구 봉익동
		System.out.println(str3);		

		String str4 = 3 + 6 + "abc";		// 9abc
		String str5 = "abc" + 3 + 6;		// abc36
		System.out.println(str4);		
		System.out.println(str5);		
	}
}