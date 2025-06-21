import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BookService service = new BookService();

		for (;;) {
			System.out.println("1.등록 | 2.전체출력 | 3.가격별 출력 | 4.번호별 출력 | 5.수정 | 6.삭제 | 0.종료");

			System.out.print("번호입력> ");
			int selectNo = scanner.nextInt();

			/*
				1. 책번호, 이름, 가격을 입력받아서 Book객체에 담고,
					Book객체를 BookService의 addBook메소드에 전달해서 저장하기
				2. BookService의 printAllBooks메소드를 실행해서 전체 책정보 출력하기
				3. 최소가격, 최대가격을 입력받아서
					BookService객체의 printBooksByPrice메소드에 전달해서 책정보 출력하기
				4. 상품번호를 입력받아서
					BookService객체의 printBookByNo메소드에 전달해서 책정보 출력하기
				5. 정보를 변경할 책번호와 새이름, 새가격을 입력받아서 Book객체에 담고,
					Book객체를 BookService객체의 updateBook메소드에 전달해서 정보 변경하기
				6. 삭제할 책번호를 입력받아서
					BookService객체의 deleteBook 메소드에 전달해서 책정보 삭제하기
			*/

			if (selectNo == 1) {
				System.out.print("책번호 입력> ");
				int no = scanner.nextInt();

				System.out.print("책이름 입력> ");
				String name = scanner.next();

				System.out.print("책가격 입력>");
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
				System.out.print("최대값 입력> ");
				int max = scanner.nextInt();

				System.out.print("최소값 입력> ");
				int min = scanner.nextInt();


			
			} else if (selectNo == 4) {
			
			} else if (selectNo == 5) {
			
			} else if (selectNo == 6) {
			
			} else if (selectNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}