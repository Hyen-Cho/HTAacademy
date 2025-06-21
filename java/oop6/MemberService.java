public class MemberService {
	private Member[] members = new Member[100];		// 회원정보 저장하는 배열
	private Product[] products = new Product[5];	// 상품정보 저장하는 배열
	private Order[] orders = new Order[100];		// 주문정보(상품+고객) 저장하는 배열

	private int position = 0;
	private int orderPosition = 0;

	// 로그인된 사용자정보를 담는 세션
	private Member session = null;

	public MemberService() {
		products[0] = new Product(100, "아이패드", 800000);
		products[1] = new Product(200, "아이폰xs", 1600000);
		products[2] = new Product(300, "갤럭시s10", 2000000);
		products[3] = new Product(400, "맥북프로", 2600000);
		products[4] = new Product(500, "LG그램", 1800000);
	}

	// 세션에 저장된 사용자정보를 반환하는 기능
	public Member getSession() {
		return session;
	}
	
	// 회원정보를 전달받아서 가입시키는 기능(members에 저장하기)
	public void register(Member member) {
		if (position < members.length) {
			members[position++] = member;
		}
	}

	// 회원번호/비밀번호를 전달받아서 로그인 처리를 수행하는 기능
		/*
			members배열에서 for문을 사용해서 사용자(Member객체)를 하나씩 가져온다.
			memberNo와 Member객체의 번호가 일치하는 사용자가 있으면
			그 사용자(Member객체)의 가입시 비밀번호와 전달받은 비밀번호를 비교한다.
			비밀번호가 일치하면 그 사용자정보(Member객체)를 session에 담는다.
		*/

	public void login(int memberNo, int password) {
		Member foundMember = null;
		for (Member b : members) {
			if (b != null && b.getNo() == memberNo) {
				foundMember = b;
				break;
			}
		}
		// return: 실행중인 메소드를 즉시 종료시키는 용도. 빠른종료
		// 올바르지 않는 경우를 먼저 검사해서 그 경우에 해당되면 메소드의 실행이 즉시 중단되게 하는 것.

		// 고객정보가 존재하지 않으면 즉시 실행 중단
		if (foundMember == null) {
			System.out.println("고객번호와 일치하는 고객이 존재하지 않습니다.");
			return;
		}

		// 비밀번호가 일치하지 않으면 즉시 실행 중단
		if (foundMember.getPassword() != password) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}

		// 올바르지 않은 경우를 전부 통과한 경우
		// 로그인처리 작업을 수행한다.
		session = foundMember;
		System.out.println("로그인이 완료되었습니다.");
		System.out.println("["+foundMember.getName()+"]님 환영합니다.");

		/*
		if (foundMember != null) {
			if (foundMember.getPassword() == password) {
				session = foundMember;
				System.out.println("로그인이 완료되었습니다.");
				System.out.println("["+foundMember.getName()+"]님 환영합니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("고객번호와 일치하는 고객이 존재하지 않습니다.");
		}
		*/
	}

	// 세션에 저장된 사용자 정보를 비우는 기능
	public void logout() {
		session = null;
	}

	// 모든 회원정보를 출력하는 기능(로그인된 사용자만 사용가능하다)
	public void printAllMembers() {
		if (session == null) {
			System.out.println("로그인 후 사용할 수 있는 기능입니다.");
			return;
		}

		for (Member b : members) {
			if (b != null) {
			System.out.println("회원번호 : " + b.getNo());
			System.out.println("회원이름 : " + b.getName());
			System.out.println("비밀번호 : " + b.getPassword());
			System.out.println("포 인 트 : " + b.getPoint());
			}
		}
	}

	// 회원번호를 전달받아서 회원정보를 출력하는 기능(로그인된 사용자만 사용가능하다)
	public void printMemberByNo(int memberNo) {
		if (session == null) {
			System.out.println("로그인 후 사용할 수 있는 기능입니다.");
			return;
		}

		for (Member b : members) {
			if (b != null && b.getNo() == memberNo) {
				System.out.println("회원번호 : " + b.getNo());
				System.out.println("회원이름 : " + b.getName());
				System.out.println("비밀번호 : " + b.getPassword());
				System.out.println("포 인 트 : " + b.getPoint());
			} 		
		}
	}

	// 모든 상품정보를 출력하는 기능
	public void printAllProducts() {
		if (session == null) {
			System.out.println("상품조회는 로그인 후 이용가능합니다.");
			return;
		} 
		for (Product p : products) {
			if (p != null) {
				System.out.println("번호 : " + p.getNo());
				System.out.println("번호 : " + p.getName());
				System.out.println("번호 : " + p.getPrice());
			}
		}
	}

	// 주문번호를 전달받아서 주문정보를 생성해서 배열에 담는 기능
		// 1. Order객체를 생성한다.
		// 2. 주문번호에 해당하는 상품정보(Product객체)를 배열에서 찾는다.
		// 3. Order객체에 상품정보(Product객체)와 주문자(로그인한 사람)정보를 저장한다.
		// 4. orders배열에 주문정보(Order객체)를 저장한다.
	public void order(int productNo) {
		if (session == null) {
			System.out.println("주문하기는 로그인 후 이용가능합니다.");
			return;
		}
		
		// 주문번호에 해당하는 상품 찾기
		Product foundProduct = null;		// 찾아야하니까 그릇부터 준비한다. 항상!
		for (Product p : products) {
			if (p != null && p.getNo() == productNo) {
				foundProduct = p;
				break;
			}
		}
		if (foundProduct == null) {
			System.out.println("상품번호에 해당하는 상품이 존재하지 않습니다.");
			return;
		}

		// 주문정보 생성하기
		Order order = new Order();
		order.setItem(foundProduct);
		order.setCustomer(session);

		// 주문정보를 배열에 저장하기
		orders[orderPosition++] = order;
		
	}

	// 현재 로그인한 사람(Session의 정보 참조)의 주문내역을 출력한다.
	public void printOrderHistory() {
		if (session == null) {
			System.out.println("주문내역조회는 로그인 후 이용가능합니다.");
			return;
		} 

		for (Order order : orders) {
			if (order != null) {

				// 주문정보에서 주문자 정보 가져오기
				Member customer = order.getCustomer();

				// 주문자 번호와 로그인한 사용자번호가 같은지 확인하기
				if (customer.getNo() == session.getNo()) {

					// 주문정보에서 주문상품 정보 가져오기
					Product item = order.getItem();

					// 주문상품 정보 출력하기
					System.out.println("주문상품번호 : " + item.getNo());
					System.out.println("주문상품이름 : " + item.getName());
					System.out.println("주문상품가격 : " + item.getPrice());
				}
			}
		}
	}
}
