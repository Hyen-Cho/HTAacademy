import java.util.Scanner;

public class ArrayDemo7 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// scanner.next() -> ���ڿ��� �о�´�.
		System.out.print("�̸� �Է�> ");
		String name = scanner.next();
		
		// scanner.nextInt() -> ���ڸ� �о�´�.
		System.out.print("���� �Է�> ");
		int age = scanner.nextInt();
		
		System.out.print("����ó �Է�> ");
		String tel = scanner.next();
		
		// scanner.nextDouble() -> �Ǽ��� �о�´�.
		System.out.print("������ �Է�> ");
		double weight = scanner.nextDouble();
		
		System.out.println();
		System.out.println("�̸� " + name);
		System.out.println("���� " + age);
		System.out.println("����ó " + tel);
		System.out.println("������ " + weight);
	}
}