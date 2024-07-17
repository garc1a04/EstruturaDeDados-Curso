package ExerciseBeecrowd.Stacks;

import java.util.Scanner;

public class bee1068 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean ok = true;
		
		while(input.hasNext()) {
			Stack1 keys = new Stack1();
			String[] expression = input.nextLine().split("");
			
			for(int i = 0; i < expression.length; i++) {
				
				if(expression[i].equals("(")) {
					keys.push(expression[i]);
				
				}else {
					if(keys.getHeigth() == 0 && expression[i].equals(")")) {
						ok = false;
						break;
					}
					
					if(expression[i].equals(")") && keys.getTop().getKeys().equals("(")) {
						keys.pop();
						ok = true;
					}
				}
			}
			
			if(keys.getTop() != null) {
				ok = false;
			}
			
			keys.printStack();
			
			String condition = ok ? "correct" : "incorrect";
			System.out.println(condition);
		}
	}
}

class Stack1{
	
	private Node1 top;
	private int heigth;
	
	public Node1 pop() {
		if(heigth == 0) return null;
		
		
		Node1 temp = top;
		top = top.getNext();
		temp.setNext(null);
		
		heigth--;
		return temp;
	}
	
	public void push(String keys) {
		Node1 newNode = new Node1(keys);
		
		if(heigth == 0) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
		
		heigth++;
		
	}
	
	public void printStack() {
		Node1 temp = top;
		while(temp != null) {
			System.out.println(temp.getKeys());
			temp = temp.getNext();
		}
	}
	
	public Node1 getTop() {
		return top;
	}
	public void setTop(Node1 top) {
		this.top = top;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	
}
class Node1{
	
	private String keys;
	private Node1 next;
	
	public Node1(String keys){
		this.setKeys(keys);
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}
}