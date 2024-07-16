package Queues;

public class Queue {
	
	private Node first;
	private Node last;
	private int length;
	
	
	public Queue(int value){
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value);
		
		if(length == 0) {
			first = newNode;
			last = newNode;
			
		} else {
			 last.setNext(newNode);
			 last = newNode;
		}
		
		length++;
	}
	
	public void printQueue() {
		Node temp = first1 ;
		
		while(temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}
	
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
}
