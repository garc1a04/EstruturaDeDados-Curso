package ExerciseBeecrowd.LinkedList;

import java.util.Scanner;


public class bee3135 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedListOrdenada2 nomes = new LinkedListOrdenada2();
		
		int N = input.nextInt();
		int i = 0;
		
		while(i++ < N) {
			String nomezin = input.next();
			nomes.add(nomezin);
		}
		
		
		int tamanho = 0;		
		int index = 0;
		String nome = "";
		
		while(nomes.getHead() != null || nomes.getTail() != null) {
			
			if(nomes.get(index) == null) {
				
				if(nome.length() > 1) {
					System.out.println(nome.trim().substring(0,nome.length()-2));					
				}
				
				index = 0;
				tamanho = 0;
				nome = "";
				
			} else if(nomes.getLenght() > index && nomes.get(index).getValue().length() <= tamanho) {
				index++;
				
			} else {
				nome+= nomes.get(index).getValue()+", ";
				tamanho = nomes.get(index).getValue().length();
				nomes.remove(index);
			}
			
		}
		
		if(nome.length() > 1) {
			System.out.println(nome.trim().substring(0,nome.length()-2));					
		}		
	}
}

class LinkedListOrdenada2{
	
	private Node1 head;
	private Node1 tail;
	private int lenght;
	
	public Node1 get(int index) {
		if(index < 0 || index >= lenght) {
			return null;
		}
		
		Node1 temp = head;
		for(int i = 0; i < index;i++) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	public Node1 removeFirst() {
		if(lenght == 0) 
			return null;
		
		Node1 temp = head;
		
		head = head.getNext();
		temp.setNext(null);
		lenght--;
		
		if(lenght == 0) 
			tail = null;
		
		return temp;
	}
	
	public Node1 removeLast() {
		if(lenght == 0)
			return null;
		
		Node1 pre = head, temp = head;
		
		while(temp.getNext() != null) {
			pre = temp;
			temp = temp.getNext();
		}
		
		tail = pre;
		tail.setNext(null);
		lenght--;
		
		if(lenght == 0) {
			head = null;
			tail = null;
		}
		
		return temp;
	}
	
	public Node1 remove(int index) {
		if(index < 0 || index >= lenght) return null;
		if(index == 0) return removeFirst();
		if(index == lenght) return removeLast();
		
		Node1 prev = get(index-1);
		Node1 temp = prev.getNext();
		
		prev.setNext(temp.getNext());
		temp.setNext(null);
		
		lenght--;
		return temp;
	}
	
	public void add(String value) {
		Node1 newNode = new Node1(value);
		
		if(lenght == 0) {
			head = newNode;
			tail = newNode;
			
		} else if(head.getValue().length() > newNode.getValue().length()) {
			newNode.setNext(head);
			head = newNode;
		
		} else if(tail.getValue().length() <= newNode.getValue().length()) {
			tail.setNext(newNode);
			tail = newNode;
			
		}else {
			Node1 temp = head;
			Node1 pre = temp;
			
			while(temp != null && temp.getValue().length() <= newNode.getValue().length()) {
				pre = temp;
				temp = temp.getNext();
			}
			
			pre.setNext(newNode);
			newNode.setNext(temp);
		}
		
		lenght++;
	}
	
	public String printList() {
		Node1 temp = head;
		String itens = "";
		
		while(temp != null) {
			itens += temp.getValue() + " ";
			temp = temp.getNext();
			
		}
		
		return itens;
	}
	public Node1 getHead() {
		return head;
	}
	public void setHead(Node1 head) {
		this.head = head;
	}
	public Node1 getTail() {
		return tail;
	}
	public void setTail(Node1 tail) {
		this.tail = tail;
	}
	public int getLenght() {
		return lenght;
	}
}

class Node1{
	
	private String value;
	private Node1 next;
	
	public Node1(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}
	
}