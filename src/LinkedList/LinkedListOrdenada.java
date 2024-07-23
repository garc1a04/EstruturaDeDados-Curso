package LinkedList;

public class LinkedListOrdenada {
	
	private Node head;
	private Node tail;
	private int length;
	
	public void add(int value) {
		Node newNode = new Node(value);
		
		if(length == 0) {
			head = newNode;
			tail = newNode;
			
		} else if(head.getValor() > value) {//adiciona no inicio
			newNode.setNext(head);
			head = newNode;
			
		} else if(tail.getValor() < value) { //adiciona no fim
			tail.setNext(newNode);
			tail = newNode;
			
		}else { //adiciona no meio "insert"
			Node temp = head;
			Node pre = temp;
			
			while(temp != null && temp.getValor() < newNode.getValor()) {
				pre = temp;
				temp = temp.getNext();
			}
			
			pre.setNext(newNode);
			newNode.setNext(temp);
		}
		
		length++;
	}
	
	public void printList() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.getValor()+" ");
			
			temp = temp.getNext();
		}
		
	}
}
