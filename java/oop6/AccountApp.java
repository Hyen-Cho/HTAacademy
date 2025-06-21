public class AccountApp {
	public static void main(String[] args) {
	
		Account.AccountBuilder builder = new Account.AccountBuilder();

		builder.no(10).name("홍길동");		// 메소드 체이닝(★return this;)
		Account account1 = builder.build();
		System.out.println("번호 : " + account1.getNo());
		System.out.println("이름 : " + account1.getName());
		System.out.println("잔액 : " + account1.getBalance());

		builder.no(20).balance(230000);
		Account account2 = builder.build();
		System.out.println("번호 : " + account2.getNo());
		System.out.println("이름 : " + account2.getName());
		System.out.println("잔액 : " + account2.getBalance());

		builder.no(40).name("김유신").balance(430000);
		Account account3 = builder.build();
		System.out.println("번호 : " + account3.getNo());
		System.out.println("이름 : " + account3.getName());
		System.out.println("잔액 : " + account3.getBalance());

		Account account4 = builder.no(50).name("강감찬").balance(5000000).build();
		System.out.println("번호 : " + account4.getNo());
		System.out.println("이름 : " + account4.getName());
		System.out.println("잔액 : " + account4.getBalance());
	}
}
