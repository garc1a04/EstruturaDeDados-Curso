package Stacks;

public class Stack {
	
	private Node top;
	private int height;
	public Stack() {}
	
	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	}
	
	public void push(int value) {
		Node newNode = new Node(value);
		
		if(height == 0) {
			top = newNode;
		} else {	
			newNode.setNext(top);
			top = newNode;			
		}
		height++;
	}
	
	public Node pop() {
		if(height == 0) return null;
		
		Node temp = top;
		top = top.getNext();
		temp.setNext(null);
		
		height--;
		
		return temp;
	}
	public void printStack() {
		Node temp = top;
		
		while(temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
		
	}
	
	public int getTop() {
		return top.getValue();
	}
	public void setTop(Node top) {
		this.top = top;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
