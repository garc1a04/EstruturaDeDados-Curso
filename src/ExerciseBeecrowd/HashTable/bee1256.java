package ExerciseBeecrowd.HashTable;

import java.util.Scanner;

public class bee1256 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repeticoes = input.nextInt();
		int i = 0;
		while(i++ < repeticoes) {
			
			HashTables valores = new HashTables(input.nextInt());
			int numeros = input.nextInt();
			
			for(int index = 0; index < numeros;index++) {
				valores.set(input.nextInt());
				
			}
			
			String print = i == repeticoes ? valores.printTable() : valores.printTable()+"\n";
			System.out.print(print);
			
		}
		
	}
}
class HashTables{
	
	private int size;
	private Node[] dataMap;
	
	public HashTables(int size) {
		this.size = size;
		dataMap = new Node[size];
	}
	
	
	public void set(int value){
		int index = hash(value);
		Node newNode = new Node(value);
		
		if(dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			
			temp.setNext(newNode);
		}
		
	}
	
	public String printTable() {
		
		String valores = "";
		for(int i = 0; i < dataMap.length;i++) {
			valores+= i+" -> ";
			Node temp = dataMap[i];
			
			while(temp != null) {
				valores+= temp.getValue()+" -> ";
				temp = temp.getNext();
			}
			
			valores+= "\\\n";
		}
		
		return valores;
	}
	
	private int hash(int value) {
		return value%size;
	}
	
	
}
class Node{
	
	private int value;
	private Node next;
	
	public Node(int value) {
		this.setValue(value);
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