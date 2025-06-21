public class Order {
	private Product item;
	private Member customer;

	public Order() {}

	public Order(Product item, Member customer) {
		this.item = item;
		this.customer = customer;
	}

	// Getter/Setter
	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}

	public Member getCustomer() {
		return customer;
	}

	public void setCustomer(Member customer) {
		this.customer = customer;
	}
}