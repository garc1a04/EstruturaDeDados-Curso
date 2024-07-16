package ExerciseBeecrowd.Stacks;

import java.util.Scanner;

public class bee2406 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repeticoes = input.nextInt();
		int i = 0;
		boolean ok;
		
		input.nextLine();
		while(i < repeticoes) {
			ok = true;
			Stack keys = new Stack();
			String array[] = input.nextLine().split("");
			
			for(int j = 0;j < array.length;j++) {
				
				if(array[j].equals("(") || array[j].equals("{") || array[j].equals("[")) {
					keys.push(array[j]);
					
				} else {
					if(keys.getHeigth() == 0) {
						ok = false;
					}
					
					else if(array[j].equals(")") && keys.getTop().getKey().equals("(")) {
						keys.pop();
						
					} else if(array[j].equals("}") && keys.getTop().getKey().equals("{")) {
						keys.pop();
					} else if(array[j].equals("]") && keys.getTop().getKey().equals("[")) {
						keys.pop();
					} else {
						
						ok = false;
					}
				}
			}
			
			if(keys.getTop() != null) {
				ok = false;
			}
			
			String condition = ok ? "S" : "N";
			
			System.out.println(condition);
			i++;
		}
		
	}
}

class Stack{
	private Node top;
	private int heigth;
	
	public Stack() {}
	
	public void push(String key) {
		Node newNode = new Node(key);
		
		if(heigth == 0) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
		
		heigth++;
	}
	
	public String pop() {
		if(heigth == 0) return null;
		
		Node temp = top;
		top = top.getNext();
		temp.setNext(null);
		
		heigth--;
		return temp.getKey();
	}
	
	public Node getTop() {
		return top;
	}
	public void setTop(Node top) {
		this.top = top;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
}

class Node{
	
	private String key;
	private Node next;
	
	public Node(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}