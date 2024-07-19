package ExerciseBeecrowd.Queue;

import java.util.Scanner;

public class bee3139 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue1 mediaFollowers = new Queue1();
		
		long followers = input.nextLong();
		long followersExpect = input.nextLong();
		
		double days = 30.00;
		int soma = 0;
		
		for(int i = 0; i < days;i++) {
			int values = input.nextInt();
			mediaFollowers.enqueue(values);
			soma+=values;
		}
		
		
		int daysCount = 0;
		
		while(followers <= followersExpect) {
			int media = (int) Math.ceil(soma/days);
			
			followers += media;
			
			soma -= mediaFollowers.dequeue().getValue();
			mediaFollowers.enqueue(media);
			soma+= media;
			
			daysCount++;
		}
		
		System.out.println(daysCount);
	}
}

class Queue1{
	
	private Node1 first;
	private Node1 last;
	private int length;
	
	public Queue1() {}
	
	public void enqueue(int value){
		Node1 newNode = new Node1(value);
		
		if(length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.setNext(newNode);
			last = newNode;
		}
		
		length++;
	}
	
	public Node1 dequeue() {
		if(length == 0) return null;
		
		Node1 temp = first;
		
		if(length == 1) {
			first = null;
			last = null;
			
		}else{
			first = first.getNext();
			temp.setNext(null);
		}
		
		length--;
		return temp;
	}
	
	public Node1 getFirst() {
		return first;
	}
	public void setFirst(Node1 first) {
		this.first = first;
	}
	public Node1 getLast() {
		return last;
	}
	public void setLast(Node1 last) {
		this.last = last;
	}
	
}

class Node1{
	
	private int value;
	private Node1 next;
	
	public Node1(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}
}