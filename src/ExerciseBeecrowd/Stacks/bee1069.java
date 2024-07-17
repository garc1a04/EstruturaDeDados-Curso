package ExerciseBeecrowd.Stacks;

import java.util.Scanner;

public class bee1069 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repeticoes = input.nextInt();
		int i = 0;
		
		input.nextLine();
		while(i < repeticoes) {
			Stack2 diamonds = new Stack2();
			String mining[] = input.nextLine().split("");
			
			int amountDiamonds = 0;
			
			for(int index = 0; index < mining.length; index++) {
				if(mining[index].equals("<")) {
					diamonds.push(mining[index]);
					
				}else {
					if(mining[index].equals(">") && diamonds.getHeight() > 0) {
						diamonds.pop();
						amountDiamonds++;
					}
				}
			}
			
			System.out.println(amountDiamonds);
			
			i++;
		}
	}
}
class Stack2{
	
	private Node2 top;
	private int height;
	
	public void push(String value) {
		Node2 newNode = new Node2(value);
		
		if(height == 0) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
		
		height++;
	}
	
	public Node2 pop() {
		if(height == 0)  return null;
		
		Node2 temp = top;
		top = top.getNext();
		temp.setNext(null);
		
		height--;
		
		return temp;
	}
	
	public Node2 getTop() {
		return top;
	}

	public void setTop(Node2 top) {
		this.top = top;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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