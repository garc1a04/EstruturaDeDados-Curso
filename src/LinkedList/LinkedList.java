package LinkedList;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int tamanho;
	
	public LinkedList(){}
	
	public LinkedList(int valor){
		Node novoNode = new Node(valor);
		head = novoNode;
		tail = novoNode;
		tamanho = 1;
	}
	
	public Node get(int index) {
		if(index < 0 || index >= tamanho) {
			return null;
		}
		
		Node temp = head;
		for(int i = 0; i < index;i++) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	public void append(int valor) {
		Node novoNode = new Node(valor);
		
		if(tamanho == 0) {
			head = novoNode;
			tail = novoNode;
		}else {
			tail.setNext(novoNode);
			tail = novoNode;	
		}
		
		tamanho++;
	}
	
	public void prepend(int valor) {
		Node novoNode = new Node(valor);
		
		if(tamanho == 0) {
			head = novoNode;
			tail = novoNode;
			
		} else {
			novoNode.setNext(head);
			head = novoNode;
			
		}
		tamanho++;
	}
	
	public Node removeLast() {
		if(tamanho == 0)
			return null;
		
		Node pre = head, temp = head;
		
		while(temp.getNext() != null) {
			pre = temp;
			temp = temp.getNext();
		}
		
		tail = pre;
		tail.setNext(null);
		tamanho--;
		
		if(tamanho == 0) {
			head = null;
			tail = null;
		}
		
		return temp;
	}
	
	public Node removeFirst() {
		if(tamanho == 0) 
			return null;
		
		Node temp = head;
		
		head = head.getNext();
		temp.setNext(null);
		tamanho--;
		
		if(tamanho == 0) 
			tail = null;
		
		return temp;
	}
	
	public void printList() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.getValor()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public int getHead() {
		return head.getValor();
	}

	public int getTail() {
		return tail.getValor();
	}

	public int getTamanho() {
		return tamanho;
	}
}
