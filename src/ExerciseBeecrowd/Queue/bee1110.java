package ExerciseBeecrowd.Queue;

import java.util.Scanner;

public class bee1110 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int cards = input.nextInt();
		
		while(cards != 0) {
			Queue queue = new Queue();
			
			for(int i = 1; i <= cards;i++) {
				queue.enqueue(i);
			}
			
			String cardsDiscarded = "";
			while(queue.getLength() != 1) {
				//queue.enqueue(queue.getFirst().getNext().getValue());
				cardsDiscarded += queue.getFirst().getValue()+", ";
				
				queue.dequeue();
				queue.enqueue(queue.getFirst().getValue());
				queue.dequeue();
				
			}
			
			String discardedCards = cards > 1 ? "Discarded cards: " + cardsDiscarded.substring(0, cardsDiscarded.length()-2) :"Discarded cards:";
			System.out.println(discardedCards);
			
			System.out.print("Remaining card: ");
			queue.printQueue();
			
			cards = input.nextInt();
		}
		
	}
}

class Queue{
	
	private Node first;
	private Node last;
	private int length;
	
	public Queue() {}
	
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
	
	public Node dequeue() {
		if(length == 0) return null;
		
		Node temp = first;
		
		if(length == 1) {
			first = null;
			last = null;
			
		}else {
			first = first.getNext();
			temp.setNext(null);
			
		}
		
		length--;
		
		return temp;
	}
	
	public void printQueue() {
		Node temp = first;
		
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

class Node {
	
	private int value;
	private Node next;
	
	public Node(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}