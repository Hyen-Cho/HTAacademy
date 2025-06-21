public class IteratorApp {
	public static void main(String[] args) {
		
		List list = new List();
		Iterator iterator = list.getIterator();

		System.out.println(iterator.empty());
		System.out.println(iterator.next());
		System.out.println(iterator.empty());
		System.out.println(iterator.next());
		System.out.println(iterator.empty());
		System.out.println(iterator.next());
		System.out.println(iterator.empty());
		System.out.println(iterator.next());
		System.out.println(iterator.empty());
		System.out.println(iterator.next());

		System.out.println(iterator.empty());
		

	}
}
