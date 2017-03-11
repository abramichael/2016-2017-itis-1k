public class LinkedCharStack implements ICharStack {
	
	private class CharElem {
		private Character value;
		public Character getValue() { return value; }

		private CharElem next;
		public CharElem getNext() { return next; }

		public CharElem(Character value, CharElem next){
			this.value = value;
			this.next = next;
		}
	}

	private CharElem head;

	public void push(Character x){
		head = new CharElem(x, head);
	}

	public Character pop(){
		if (head == null)
			return null;
		Character c = head.getValue();
		head = head.getNext();
		return c;
	}

	public boolean isEmpty(){
		return head == null;
	}

}