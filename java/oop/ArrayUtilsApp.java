public class ArrayUtilsApp {
	
	public static void main(String[] args) {
	
		ArrayUtils util = new ArrayUtils();

		int[] numbers = {1, 10, 100, 39};
		util.printArray(numbers);				
		int maxNumber = util.max(numbers);
		System.out.println("�ְ���� : " + maxNumber);

		int[] scores = {60, 70 ,30, 46, 98, 100};
		util.printArray(scores);
		int maxScore = util.max(numbers);
		System.out.println("�ְ����� : " + maxScore);

		util.printArray(numbers);
		int minNumber = util.min(numbers);
		System.out.println("�ּ����� : " + minNumber);


		
		int[] numbers2 = util.two(numbers);
		util.printArray(numbers2);
	}
}
