package ExerciseBeecrowd.Queue;

import java.util.Scanner;

public class bee3163 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//(-4 representa o lado leste, -3 o lado norte, -2 lado sul e -1 lado oeste)
		Queue2 leste = new Queue2();
		Queue2 norte = new Queue2();
		Queue2 sul = new Queue2();
		Queue2 oeste = new Queue2();
		
		Queue2 juntos = new Queue2();
		
		String ponto = "";
		String temp = null; 
		while(!ponto.equals("0")) {
			ponto = input.next();
			
			if(ponto.equals("-1") || ponto.equals("-2") || ponto.equals("-3") || ponto.equals("-4") || ponto.equals("0")) {
				temp = ponto;
				
			} else {
				
				if(temp.equals("-1")) {
					oeste.enqueue(ponto);
				} else if(temp.equals("-2")) {
					sul.enqueue(ponto);
				} else if(temp.equals("-3")) {
					norte.enqueue(ponto);
				} else if(temp.equals("-4")) {
					leste.enqueue(ponto);
				}
				
			}
		}
		
		
		boolean condicao = leste.getLast() != null || oeste.getLast() != null || sul.getLast() != null || norte.getLast() != null;
		do {
			
			if(oeste.getLast() != null){
				juntos.enqueue(oeste.dequeue().getValue());
			} if(norte.getLast() != null) {
				juntos.enqueue(norte.dequeue().getValue());
			} if(sul.getLast() != null) {
				juntos.enqueue(sul.dequeue().getValue());
			} if(leste.getLast() != null) {
				juntos.enqueue(leste.dequeue().getValue());
			}
			
			condicao = leste.getLast() != null || oeste.getLast() != null || sul.getLast() != null || norte.getLast() != null;
		
		}while(condicao);
		
		String avioes = "";
		
		while(juntos.getLast() != null) {
			avioes += juntos.dequeue().getValue() + " ";
		}
		
		System.out.println(avioes.trim());
		
	}
}

class Queue2{
	
	private Node2 first;
	private Node2 last;
	private int length;

	public void enqueue(String value) {
		Node2 newNode = new Node2(value);
		
		if(length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.setNext(newNode);
			last = newNode;
		}
		
		length++;
	}
	
	public Node2 dequeue() {
		if(length == 0) return null;
		
		Node2 temp = first;
		
		if(length == 1) {
			first = null;
			last = null;
		} else {
			first = first.getNext();
			temp.setNext(null);
			
		}
		
		length--;
		return temp;
	}

	public Node2 getFirst() {
		return first;
	}

	public void setFirst(Node2 first) {
		this.first = first;
	}

	public Node2 getLast() {
		return last;
	}

	public void setLast(Node2 last) {
		this.last = last;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
class Node2{
	private String value;
	private Node2 next;
	
	public Node2(String value) {
		this.setValue(value);
	}

	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 next) {
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
