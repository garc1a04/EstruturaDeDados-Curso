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
	
	public boolean set(int index, int valor) {
		Node temp = get(index);
		
		if(temp != null) {
			temp.setValor(valor);
			
			return true;
		}
		
		return false;
	}
	
	public boolean insert(int index, int valor) {
		if(index < 0 || index > tamanho) 
			return false;
		
		if(index == 0) {
			prepend(valor);
			return true;
		}
		
		if(index == tamanho) {
			append(valor);
			return true;
		}
		
		Node novoNode = new Node(valor);
		Node temp = get(index - 1);
		
		novoNode.setNext(temp.getNext());
		temp.setNext(novoNode);
		
		tamanho++;
		
		return true;
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
	
	public Node remove(int index) {
		if(index < 0 || index >= tamanho) return null;
		if(index == 0) return removeFirst();
		if(index == tamanho-1) return removeLast();
		
		Node prev = get(index-1);
		Node temp = prev.getNext();
		
		prev.setNext(temp.getNext());
		temp.setNext(null);
		tamanho--;
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
	
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		
		Node depois = temp.getNext();
		Node antes = null;
		for(int i = 0; i < tamanho;i++) {
			depois = temp.getNext();
			temp.setNext(antes);
			antes = temp;
			temp = depois;
		}
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
