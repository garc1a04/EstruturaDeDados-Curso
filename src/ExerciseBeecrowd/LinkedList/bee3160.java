package ExerciseBeecrowd.LinkedList;

import java.util.Scanner;

public class bee3160 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList amigosLuiggy = new LinkedList();
		
		String amigosAtuais[] = input.nextLine().split(" ");
		String amigosNovos[] = input.nextLine().split(" ");
		String indicou = input.next();
		
		for(String amigos: amigosAtuais) {
			amigosLuiggy.append(amigos);
		}
		
		if(indicou.equals("nao")) {
			for(String amigos: amigosNovos) {
				amigosLuiggy.append(amigos);
			}
			
		}else {
			int index = amigosLuiggy.get(indicou);
			
			for(int i = 0; i < amigosNovos.length;i++) {
				amigosLuiggy.insert(index, amigosNovos[i]);
				index++;
			}
			
		}
		
		String print = amigosLuiggy.printList();
		System.out.println(print.substring(0,print.length()-1));
	}
}

class LinkedList{
	
	private Node head;
	private Node tail;
	private int length;
	
	public void append(String value) {
		Node newNode = new Node(value);
		
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		
		length++;
		
	}
	
	public Node removeLast() {
		if(length == 0) 
			return null;
		
		Node temp = head;
		Node pre = temp;
		
		while(temp.getNext() != null) {
			pre = temp;
			temp = temp.getNext();
		}
		
		
		tail = pre;
		tail.setNext(null);
		length--;
		
		if(length == 0) {
			head = null;
			tail = null;
		}
		
		return temp;
	}
	
	public void prepend(String value) {
		Node newNode = new Node(value);
		
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		
		length++;
	}

	public Node removeFirst() {
		if(length == 0) return null;
		
		Node temp = head;
		head = head.getNext();
		temp.setNext(null);
		
		length--;
		
		if(length == 0) {
			tail = null;
		}
		
		return head;
	}
	
	public Node get(int index) {
		if(index < 0 || index >= length) return null;
		
		Node temp = head;
		for(int i = 0; i < index;i++) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	public int get(String value) {
		int index = 0;
		Node temp = head;
		
		while(temp != null) {
			if(temp.getValue().equals(value)) {
				return index;
			}
			
			temp = temp.getNext();
			index++;
		}
		
		return -1;
	}
	
	public boolean set(int index, String value) {
		Node temp = get(index);
		
		if(temp != null) {
			temp.setValue(value);
			
			return true;
		}
		
		return false;
	}
	
	public boolean insert(int index, String value) {
		if(index < 0 || index > length) return false;
		
		if(index == 0) {
			prepend(value);
			return true;
		}
		if(index == length) {
			append(value);
			return true;
		}
		
		Node newNode = new Node(value);
		Node temp = get(index-1);
		
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		
		length++;
		return true;
	}
	
	public Node remove(int index) {
		if(index < 0 || index >= length) return null;
		
		if(index == 0) return removeFirst();
		if(index == length-1) return removeLast();
		
		Node pre = get(index-1);
		Node temp = pre.getNext();
		
		pre.setNext(temp.getNext());
		temp.setNext(null);
		length--;
		return head;
	}
	
	public String printList() {
		Node temp = head;
		
		String aux = "";
		while(temp != null) {
			aux += temp.getValue()+" ";
			temp = temp.getNext();
		}
		
		return aux;
	}
	
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}

class Node{
	
	private String value;
	private Node next;
	
	public Node(String value) {
		this.value = value;
		
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
