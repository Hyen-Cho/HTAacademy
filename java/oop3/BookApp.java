import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BookService service = new BookService();

		for (;;) {
			System.out.println("1.��� | 2.��ü��� | 3.���ݺ� ��� | 4.��ȣ�� ��� | 5.���� | 6.���� | 0.����");

			System.out.print("��ȣ�Է�> ");
			int selectNo = scanner.nextInt();

			/*
				1. å��ȣ, �̸�, ������ �Է¹޾Ƽ� Book��ü�� ���,
					Book��ü�� BookService�� addBook�޼ҵ忡 �����ؼ� �����ϱ�
				2. BookService�� printAllBooks�޼ҵ带 �����ؼ� ��ü å���� ����ϱ�
				3. �ּҰ���, �ִ밡���� �Է¹޾Ƽ�
					BookService��ü�� printBooksByPrice�޼ҵ忡 �����ؼ� å���� ����ϱ�
				4. ��ǰ��ȣ�� �Է¹޾Ƽ�
					BookService��ü�� printBookByNo�޼ҵ忡 �����ؼ� å���� ����ϱ�
				5. ������ ������ å��ȣ�� ���̸�, �������� �Է¹޾Ƽ� Book��ü�� ���,
					Book��ü�� BookService��ü�� updateBook�޼ҵ忡 �����ؼ� ���� �����ϱ�
				6. ������ å��ȣ�� �Է¹޾Ƽ�
					BookService��ü�� deleteBook �޼ҵ忡 �����ؼ� å���� �����ϱ�
			*/

			if (selectNo == 1) {
				System.out.print("å��ȣ �Է�> ");
				int no = scanner.nextInt();

				System.out.print("å�̸� �Է�> ");
				String name = scanner.next();

				System.out.print("å���� �Է�>");
				int price = scanner.nextInt();

				Book book = new Book();
				book.setNo(no);
				book.setName(name);
				book.setPrice(price);

				service.addBook(book);
			
			} else if (selectNo == 2) {
				System.out.println("-----------");

				service.printAllBooks();
			
			} else if (selectNo == 3) {
				System.out.print("�ִ밪 �Է�> ");
				int max = scanner.nextInt();

				System.out.print("�ּҰ� �Է�> ");
				int min = scanner.nextInt();


			
			} else if (selectNo == 4) {
			
			} else if (selectNo == 5) {
			
			} else if (selectNo == 6) {
			
			} else if (selectNo == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}