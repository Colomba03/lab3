
public class SinglyLinkedQueue<E> implements Queue<E>{
	
	@SuppressWarnings("unused")
	private class Node {
		private E value;
		private Node next;
		
		public Node(E value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public Node(E value) {
			this(value, null); // Delegate to other constructor
		}
		
		public Node() {
			this(null, null); // Delegate to other constructor
		}

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		public void clear() {
			value = null;
			next = null;
		}				
	}
	
	int currentSize;
	Node header, trailer;
	
	public SinglyLinkedQueue() {
		currentSize = 0;
		header = new Node();
		trailer = new Node(null, null);
		header.setNext(trailer);
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		if(e == null)
			throw new IllegalArgumentException("Parameter cannot be null");
		Node newNode = new Node(e, trailer);
		
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E front() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
