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
	
	public Node removeLast() {
		if(tamanho == 0) {
			head = null;
			tail = null;
			
			return null;
		}
		
		Node pre = head, temp = head;
		
		while(temp.getNext() != null) {
			pre = temp;
			temp = temp.getNext();
		}
		
		tail = pre;
		tail.setNext(null);
		tamanho--;
		
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
	
	public int getInicio() {
		return head.getValor();
	}

	public int getFim() {
		return tail.getValor();
	}

	public int getTamanho() {
		return tamanho;
	}
}
