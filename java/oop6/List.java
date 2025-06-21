public class List {

	int[] data = {10, 20, 30, 40, 50};

	public Iterator getIterator() {
		Iterator it = new ListIterator();
		return it;
	}

	class ListIterator implements Iterator {
		int[] clone;
		int position;
		public ListIterator() {
			clone = data;
			position = 0;
		}
		
		public int next() {
			int number = 0;
			number = clone[position];
			position++;

			return number;
		}

		public boolean empty() {
			if (position < clone.length) {
				return false;
			} else {
				return true;
			}
		}
	}
}
