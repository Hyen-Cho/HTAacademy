public class BookService {
	private Book[] database = new Book[10];
	private int position = 0;

	// ���ο� å ������ ���޹޾Ƽ� ����ϴ� ���
	public void addBook(Book book) {
		if (position < database.length) {
			database[position] = book;
			position++;
		}
	}

	// ��� å ������ ����ϴ� ���
	public void printAllBooks() {
		for (Book b : database) {
			if (b != null) {
				System.out.println("å��ȣ : " + b.getNo());
				System.out.println("å�̸� : " + b.getName());
				System.out.println("å���� : " + b.getPrice());
			}		
		}
	
	}

	// �ּҰ��ݰ� �ִ밡���� ���޹޾Ƽ� �ش��ϴ� å������ ����ϴ� ���
	public void printBooksByPrice(int min, int max) {
		for (Book b : database) {
			if (b != null) {
				if (b.getPrice() >= min && b.getPrice() <= max) {
					System.out.println("å��ȣ : " + b.getNo());
					System.out.println("å�̸� : " + b.getName());
					System.out.println("å���� : " + b.getPrice());
				}
			}
		}
	}

	// å ��ȣ�� ���޹޾Ƽ� �ش� å�� ����ϴ� ���
	public void printBookByNo(int no) {
		for (Book b : database) {
			if (b != null && b.getNo() == no) {
				System.out.println("å��ȣ : " + b.getNo());
				System.out.println("å�̸� : " + b.getName());
				System.out.println("å���� : " + b.getPrice());
			}
		}
	
	}

	// å������ ���޹޾Ƽ� �� å��ȣ�� �ش��ϴ� å������ �����ϴ� ���
	// �Է�: �ٲ�å��ȣ,�̸�,���� 
	public void updateBook(Book book) {
		for(Book b : database) {
			if (b != null && b.getNo() == book.getNo()) {
				b.setName(book.getName());
				b.setPrice(book.getPrice());
			}
			
		}
	}

	// å��ȣ�� ���޹޾Ƽ� �ش� å�� �����ϴ� ���
	// ������ å��ȣ�� �Է¹޴´�. null�� �����-> �������������� ���ڸ��� �ű��.
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