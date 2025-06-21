public class BookService {
	private Book[] database = new Book[10];
	private int position = 0;

	// 새로운 책 정보를 전달받아서 등록하는 기능
	public void addBook(Book book) {
		if (position < database.length) {
			database[position] = book;
			position++;
		}
	}

	// 모든 책 정보를 출력하는 기능
	public void printAllBooks() {
		for (Book b : database) {
			if (b != null) {
				System.out.println("책번호 : " + b.getNo());
				System.out.println("책이름 : " + b.getName());
				System.out.println("책가격 : " + b.getPrice());
			}		
		}
	
	}

	// 최소가격과 최대가격을 전달받아서 해당하는 책정보를 출력하는 기능
	public void printBooksByPrice(int min, int max) {
		for (Book b : database) {
			if (b != null) {
				if (b.getPrice() >= min && b.getPrice() <= max) {
					System.out.println("책번호 : " + b.getNo());
					System.out.println("책이름 : " + b.getName());
					System.out.println("책가격 : " + b.getPrice());
				}
			}
		}
	}

	// 책 번호를 전달받아서 해당 책을 출력하는 기능
	public void printBookByNo(int no) {
		for (Book b : database) {
			if (b != null && b.getNo() == no) {
				System.out.println("책번호 : " + b.getNo());
				System.out.println("책이름 : " + b.getName());
				System.out.println("책가격 : " + b.getPrice());
			}
		}
	
	}

	// 책정보를 전달받아서 그 책번호에 해당하는 책정보를 변경하는 기능
	// 입력: 바꿀책번호,이름,가격 
	public void updateBook(Book book) {
		for(Book b : database) {
			if (b != null && b.getNo() == book.getNo()) {
				b.setName(book.getName());
				b.setPrice(book.getPrice());
			}
			
		}
	}

	// 책번호를 전달받아서 해당 책을 삭제하는 기능
	// 삭제할 책번호만 입력받는다. null로 만들고-> 마지막포지션을 빈자리로 옮긴다.
	public void deleteBook(int no) {
		int index = -1;

		for (int i=0; i<position; i++) {
			Book book = database[i];
			if (book.getNo() == no) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			if (index < (position - 1)) {
				database[index] = database[position-1];
			}
			database[position-1] = null;
			position--;
		}
	}
}