public class MemberService {
	private Member[] members = new Member[100];		// ȸ������ �����ϴ� �迭
	private Product[] products = new Product[5];	// ��ǰ���� �����ϴ� �迭
	private Order[] orders = new Order[100];		// �ֹ�����(��ǰ+��) �����ϴ� �迭

	private int position = 0;
	private int orderPosition = 0;

	// �α��ε� ����������� ��� ����
	private Member session = null;

	public MemberService() {
		products[0] = new Product(100, "�����е�", 800000);
		products[1] = new Product(200, "������xs", 1600000);
		products[2] = new Product(300, "������s10", 2000000);
		products[3] = new Product(400, "�ƺ�����", 2600000);
		products[4] = new Product(500, "LG�׷�", 1800000);
	}

	// ���ǿ� ����� ����������� ��ȯ�ϴ� ���
	public Member getSession() {
		return session;
	}
	
	// ȸ�������� ���޹޾Ƽ� ���Խ�Ű�� ���(members�� �����ϱ�)
	public void register(Member member) {
		if (position < members.length) {
			members[position++] = member;
		}
	}

	// ȸ����ȣ/��й�ȣ�� ���޹޾Ƽ� �α��� ó���� �����ϴ� ���
		/*
			members�迭���� for���� ����ؼ� �����(Member��ü)�� �ϳ��� �����´�.
			memberNo�� Member��ü�� ��ȣ�� ��ġ�ϴ� ����ڰ� ������
			�� �����(Member��ü)�� ���Խ� ��й�ȣ�� ���޹��� ��й�ȣ�� ���Ѵ�.
			��й�ȣ�� ��ġ�ϸ� �� ���������(Member��ü)�� session�� ��´�.
		*/

	public void login(int memberNo, int password) {
		Member foundMember = null;
		for (Member b : members) {
			if (b != null && b.getNo() == memberNo) {
				foundMember = b;
				break;
			}
		}
		// return: �������� �޼ҵ带 ��� �����Ű�� �뵵. ��������
		// �ùٸ��� �ʴ� ��츦 ���� �˻��ؼ� �� ��쿡 �ش�Ǹ� �޼ҵ��� ������ ��� �ߴܵǰ� �ϴ� ��.

		// �������� �������� ������ ��� ���� �ߴ�
		if (foundMember == null) {
			System.out.println("����ȣ�� ��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
			return;
		}

		// ��й�ȣ�� ��ġ���� ������ ��� ���� �ߴ�
		if (foundMember.getPassword() != password) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return;
		}

		// �ùٸ��� ���� ��츦 ���� ����� ���
		// �α���ó�� �۾��� �����Ѵ�.
		session = foundMember;
		System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
		System.out.println("["+foundMember.getName()+"]�� ȯ���մϴ�.");

		/*
		if (foundMember != null) {
			if (foundMember.getPassword() == password) {
				session = foundMember;
				System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
				System.out.println("["+foundMember.getName()+"]�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("����ȣ�� ��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
		}
		*/
	}

	// ���ǿ� ����� ����� ������ ���� ���
	public void logout() {
		session = null;
	}

	// ��� ȸ�������� ����ϴ� ���(�α��ε� ����ڸ� ��밡���ϴ�)
	public void printAllMembers() {
		if (session == null) {
			System.out.println("�α��� �� ����� �� �ִ� ����Դϴ�.");
			return;
		}

		for (Member b : members) {
			if (b != null) {
			System.out.println("ȸ����ȣ : " + b.getNo());
			System.out.println("ȸ���̸� : " + b.getName());
			System.out.println("��й�ȣ : " + b.getPassword());
			System.out.println("�� �� Ʈ : " + b.getPoint());
			}
		}
	}

	// ȸ����ȣ�� ���޹޾Ƽ� ȸ�������� ����ϴ� ���(�α��ε� ����ڸ� ��밡���ϴ�)
	public void printMemberByNo(int memberNo) {
		if (session == null) {
			System.out.println("�α��� �� ����� �� �ִ� ����Դϴ�.");
			return;
		}

		for (Member b : members) {
			if (b != null && b.getNo() == memberNo) {
				System.out.println("ȸ����ȣ : " + b.getNo());
				System.out.println("ȸ���̸� : " + b.getName());
				System.out.println("��й�ȣ : " + b.getPassword());
				System.out.println("�� �� Ʈ : " + b.getPoint());
			} 		
		}
	}

	// ��� ��ǰ������ ����ϴ� ���
	public void printAllProducts() {
		if (session == null) {
			System.out.println("��ǰ��ȸ�� �α��� �� �̿밡���մϴ�.");
			return;
		} 
		for (Product p : products) {
			if (p != null) {
				System.out.println("��ȣ : " + p.getNo());
				System.out.println("��ȣ : " + p.getName());
				System.out.println("��ȣ : " + p.getPrice());
			}
		}
	}

	// �ֹ���ȣ�� ���޹޾Ƽ� �ֹ������� �����ؼ� �迭�� ��� ���
		// 1. Order��ü�� �����Ѵ�.
		// 2. �ֹ���ȣ�� �ش��ϴ� ��ǰ����(Product��ü)�� �迭���� ã�´�.
		// 3. Order��ü�� ��ǰ����(Product��ü)�� �ֹ���(�α����� ���)������ �����Ѵ�.
		// 4. orders�迭�� �ֹ�����(Order��ü)�� �����Ѵ�.
	public void order(int productNo) {
		if (session == null) {
			System.out.println("�ֹ��ϱ�� �α��� �� �̿밡���մϴ�.");
			return;
		}
		
		// �ֹ���ȣ�� �ش��ϴ� ��ǰ ã��
		Product foundProduct = null;		// ã�ƾ��ϴϱ� �׸����� �غ��Ѵ�. �׻�!
		for (Product p : products) {
			if (p != null && p.getNo() == productNo) {
				foundProduct = p;
				break;
			}
		}
		if (foundProduct == null) {
			System.out.println("��ǰ��ȣ�� �ش��ϴ� ��ǰ�� �������� �ʽ��ϴ�.");
			return;
		}

		// �ֹ����� �����ϱ�
		Order order = new Order();
		order.setItem(foundProduct);
		order.setCustomer(session);

		// �ֹ������� �迭�� �����ϱ�
		orders[orderPosition++] = order;
		
	}

	// ���� �α����� ���(Session�� ���� ����)�� �ֹ������� ����Ѵ�.
	public void printOrderHistory() {
		if (session == null) {
			System.out.println("�ֹ�������ȸ�� �α��� �� �̿밡���մϴ�.");
			return;
		} 

		for (Order order : orders) {
			if (order != null) {

				// �ֹ��������� �ֹ��� ���� ��������
				Member customer = order.getCustomer();

				// �ֹ��� ��ȣ�� �α����� ����ڹ�ȣ�� ������ Ȯ���ϱ�
				if (customer.getNo() == session.getNo()) {

					// �ֹ��������� �ֹ���ǰ ���� ��������
					Product item = order.getItem();

					// �ֹ���ǰ ���� ����ϱ�
					System.out.println("�ֹ���ǰ��ȣ : " + item.getNo());
					System.out.println("�ֹ���ǰ�̸� : " + item.getName());
					System.out.println("�ֹ���ǰ���� : " + item.getPrice());
				}
			}
		}
	}
}
