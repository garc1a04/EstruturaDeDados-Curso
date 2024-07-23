package ExerciseBeecrowd.LinkedList;

import java.util.Scanner;

import LinkedList.Node;

public class bee2729 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int N = input.nextInt();
		int i= 0;
		
		input.nextLine();
		while(i++ < N) {
			LinkedListOrdenada listaCompras = new LinkedListOrdenada();
			String itens[] = input.nextLine().split(" ");
			
			for(String item: itens) {
				if(!listaCompras.contains(item)) {
					listaCompras.add(item);					
				}
				
			}
			
			String print = listaCompras.printList();
			System.out.println(print.trim());
		}
		
	}
}

class LinkedListOrdenada{
	
	private Node3 head;
	private Node3 tail;
	private int length;
	
	public Node3 get(int index) {
		if(index < 0 || index >= length) {
			return null;
		}
		
		Node3 temp = head;
		for(int i = 0; i < index;i++) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	public Node3 removeFirst() {
		if(length == 0) 
			return null;
		
		Node3 temp = head;
		
		head = head.getNext();
		temp.setNext(null);
		length--;
		
		if(length == 0) 
			tail = null;
		
		return temp;
	}
	
	public void add(String value) {
		Node3 newNode = new Node3(value);
		
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else if(head.getValue().compareTo(newNode.getValue()) > 0) {
			newNode.setNext(head);
			head = newNode;
			
		} else if(tail.getValue().compareTo(newNode.getValue()) < 0) {
			tail.setNext(newNode);
			tail = newNode;
			
		} else {
			Node3 temp = head;
			Node3 pre = temp;
			
			while(temp != null && temp.getValue().compareTo(newNode.getValue()) < 0) {
				pre = temp;
				temp = temp.getNext();
			}
			
			pre.setNext(newNode);
			newNode.setNext(temp);
		}
		
		length++;
		
	}

	public boolean contains(String item) {
		Node3 temp = head;
		
		while(temp != null) {
			
			if(temp.getValue().equals(item)) {
				return true;	
			}
			
			temp = temp.getNext();
		}
		
		return false;
	}

	public String printList() {
		Node3 temp = head;
		String itens = "";
		
		while(temp != null) {
			itens += temp.getValue() + " ";
			temp = temp.getNext();
			
		}
		
		return itens;
	}
}

class Node3{
	private String value;
	private Node3 next;
	
	public Node3(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node3 getNext() {
		return next;
	}
	public void setNext(Node3 next) {
		this.next = next;
	}
	
	
	
}