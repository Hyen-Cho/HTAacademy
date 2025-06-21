public class Account {
	private int no;
	private String name;
	private int balance;

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public static class AccountBuilder {
		private int no;
		private String name;
		private int balance;

		public AccountBuilder no(int no) {
			this.no = no;
			return this;
		}

		public AccountBuilder name(String name) {
			this.name = name;
			return this;
		}

		public AccountBuilder balance(int balance) {
			this.balance = balance;
			return this;
		}

		public Account build() {
			Account account = new Account();
			account.no = no;
			account.name = name;
			account.balance = balance;
			return account;
		}
	}
}
