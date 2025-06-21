public class VarDemo4 {
	public static void main(String[] args) {
		
		// 변수의 값은 사용하는 시점에 따라서 결과값이 다를 수 있다.
		
		// 변수를 생성하고 값을 대입한다.
		int num1 = 100;
		int num2 = 200;
		System.out.println(num1 + num2);

		// 기존 변수에 새로운 값을 대입한다(새로운 값으로 변경한다.)
		num1 = 600;
		num2 = 300;
		System.out.println(num1 + num2);

	}
}