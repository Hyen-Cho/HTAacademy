import java.util.Scanner;

public class ForDemo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ���� �ΰ��� �Է¹޾Ƽ� ù��° ���ں��� �ι�° ���ڻ����� �հ踦 ���ϴ� ���α׷�
		// ����ڰ� ���ۼ��ڸ� �����ں��� ��ũ�� �Է����� ��� ��������
		
		int begin = 0;
		int end = 0;
		int total = 0;

		System.out.println("���� ���ڸ� �Է��Ͻÿ�.");
		begin = scanner.nextInt();
		System.out.println("�� ���ڸ� �Է��Ͻÿ�.");
		end = scanner.nextInt();

		// �� ���� ǥ��

		if (begin < end) {
			
			//�ٸ�ǥ��
			for (; begin<=end; begin++) {
			total += begins;
			}
			System.out.println(total);
		
		} else {
			System.out.println("���� �ùٸ��� �ʽ��ϴ�.");
			
		}
		
	}
}
