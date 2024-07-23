package ExerciseBeecrowd.Stacks;

import java.util.Scanner;

//Algoritmo de Shunting-Yard

public class bee1077 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repeticoes = input.nextInt();
		int i = 0;
		input.nextLine();
		
		while(i < repeticoes) {
			Stack3 operadores = new Stack3();
			String expressao[] = input.nextLine().split("");
			
			for(int j = 0; j < expressao.length;j++) {
				char valor = expressao[j].charAt(0);
				
				if(isDigito(valor) || isLetra(valor)) {
					System.out.print(valor);
					
				}else if(valor == '(' || valor == '^') {
					operadores.push(valor);
				} else if(valor == ')') {
					
					while(!operadores.empty() && operadores.getTop().getValue() != '(') {
						System.out.print(operadores.pop().getValue());
					}
					
					
					if(!operadores.empty()) {
						operadores.pop();
					}
				} else {
					
					while(!operadores.empty() && operadores.getTop().getValue() != '(' && maiorPrecedencia(valor) <= maiorPrecedencia(operadores.getTop().getValue())) {
						System.out.print(operadores.pop().getValue());
					}
					
					operadores.push(valor);
				}				
			}
			
			
			while(!operadores.empty()) {
				System.out.print(operadores.pop().getValue());
			}
			
			System.out.println();
			i++;
		}
	}
	
	
	
	
	private static boolean isLetra(char valor) {
		
		if(valor >= 'A' && valor <= 'Z') {
			return true;
		} else if(valor >= 'a' && valor <= 'z') {
			return true;
		}
		
		return false;
	}




	private static boolean isDigito(char valor) {
		
		if(valor >= '0' && valor <= '9') {
			return true;
		}
		
		return false;
	}
	
	private static int maiorPrecedencia(char valor) {
		
		if(valor == '+' || valor == '-'){
			return 1;
		} else if(valor == '*' || valor == '/') {
			return 2;
		} else if(valor == '^') {
			return 3;
		}
		
		return 0;
	}
}

class Stack3 {
	
	private Node3 top;
	private int height;
	
	public boolean empty() {
		if(getTop() == null) {
			return true;
		}
		
		return false;
	}
	
	public void push(char value) {
		Node3 newNode = new Node3(value);
		
		if(height == 0) {
			top = newNode;
		}else {
			newNode.setNext(top);
			top = newNode;
		}
		
		height++;
	}
	
	public Node3 pop() {
		if(height == 0) return null;
		
		Node3 temp = top;
		top = top.getNext();
		temp.setNext(null);
		
		return temp;
	}
	
	public Node3 getTop() {
		return top;
	}
	public void setTop(Node3 top) {
		this.top = top;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
class Node3 {
	private char value;
	private Node3 next;
	
	public Node3(char value) {
		this.value = value;
	}
	
	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
	public Node3 getNext() {
		return next;
	}
	public void setNext(Node3 next) {
		this.next = next;
	}
}