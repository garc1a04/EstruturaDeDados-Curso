package ExerciseBeecrowd.LinkedList;

import java.util.Scanner;

public class bee2174 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList2 pomekons = new LinkedList2();
		int qtdPomekons = 151;
		int N = input.nextInt();
		int i = 0;
		while(i++ < N) {
			String pomekon = input.next();
			
			if(!pomekons.contains(pomekon)) {
				pomekons.append(pomekon);				
			}
		}
		
		System.out.println("Falta(m) "+(qtdPomekons - pomekons.getlenght())+" pomekon(s).");
	}
}
class LinkedList2{
	
	private Node2 head;
	private Node2 tail;
	private int lenght;
	
	public void append(String value) {
		Node2 newNode = new Node2(value);
		
		if(lenght == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		
		lenght++;
	}
	
	public void prepend(String value) {
		Node2 newNode = new Node2(value);
		
		if(lenght == 0) {
			head = newNode;
			tail = newNode;
			
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		
		lenght++;
	}

	public boolean contains(String value) {
		Node2 temp = head;
		
		while(temp != null) {
			if(temp.getValue().equals(value)) {
				return true;
			}
			
			temp = temp.getNext();
		}
		
		return false;
	}
	
	public void printList() {
		Node2 temp = head;
		
		while(temp !=null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
		
	}
	public int getlenght() {
		return lenght;
	}
}
class Node2{
	private String value;
	private Node2 next;
	
	public Node2(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node2 getNext() {
		return next;
	}
	public void setNext(Node2 next) {
		this.next = next;
	}
	
}