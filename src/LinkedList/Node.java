package LinkedList;

public class Node {
	private int valor;
	private Node next;
	
	Node(int valor){
		this.valor = valor;
	}
	
	
	public int getValor() {
		return valor;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
}
