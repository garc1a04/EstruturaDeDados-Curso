package ExerciseBeecrowd.LinkedList;

import java.util.Scanner;

public class bee2022 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			String nome = input.next();
			int qtdPresente = input.nextInt();
			int i = 0;
			
			LinkedListOrdenado presentesNatal = new LinkedListOrdenado();
			
			input.nextLine();
			while(i++ < qtdPresente){
				String nomeProduto = input.nextLine();
				double preco = input.nextDouble();
				int preferencia = input.nextInt();
				input.nextLine();
				
				presentesNatal.add(new Presente(nomeProduto,preco,preferencia));
			}
			
			
			System.out.println("Lista de "+ nome);
			String print = presentesNatal.printList();
			System.out.println(print);
			
		}
		
	}
}

class LinkedListOrdenado {
	
	private Node4 head;
	private Node4 tail;
	private int length;
	
	public void add(Presente value) {
		Node4 newNode = new Node4(value);
		
		if(length == 0) {
			head = newNode;
			tail = newNode;
			
		} else if(ordem(head.getValor(),newNode.getValor())) {
			newNode.setNext(head);
			head = newNode;
			
		} else if(ordem(newNode.getValor(), tail.getValor())) {
			tail.setNext(newNode);
			tail = newNode;
			
		} else {
			Node4 temp = head;
			Node4 pre = temp;
			
			while(temp != null && ordem(newNode.getValor(), temp.getValor())) {
				pre = temp;
				temp = temp.getNext();
				
			}
			
			pre.setNext(newNode);
			newNode.setNext(temp);
			
		}
		
		length++;
	}
	
	public boolean ordem(Presente x, Presente y) {
		boolean igual = x.getPreferencia() == y.getPreferencia();
		boolean maiorMenor = x.getPreferencia() < y.getPreferencia() ? true : false;
		
		
		if(igual) {
			maiorMenor = x.getPreco() > y.getPreco() ? true : false;
			igual = x.getPreco() == y.getPreco();
			
		}if(igual) {
			maiorMenor = x.getNome().compareTo(y.getNome()) > 0 ? true : false;
		
		}
		return maiorMenor;
	}
	
	public String printList() {
		Node4 temp = head;
		String print = "";
		
		while(temp != null) {
			print += String.format("%s - R$%.2f\n",temp.getValor().getNome(),temp.getValor().getPreco());
			
			temp = temp.getNext();
		}
		
		return print;
	}
	
	public Node4 getHead() {
		return head;
	}
	public void setHead(Node4 head) {
		this.head = head;
	}
	public Node4 getTail() {
		return tail;
	}
	public void setTail(Node4 tail) {
		this.tail = tail;
	}
	public int getLength() {
		return length;
	}
}

class Node4{
	
	private Presente valor;
	private Node4 next;
	
	public Node4(Presente value) {
		this.valor = value;
	}
	
	public Presente getValor() {
		return valor;
	}
	public void setValor(Presente valor) {
		this.valor = valor;
	}
	public Node4 getNext() {
		return next;
	}
	public void setNext(Node4 next) {
		this.next = next;
	}
}

class Presente{
	
	private String nome;
	private double preco;
	private int preferencia;
	
	public Presente(String nome, double preco, int preferencia) {
		setNome(nome);
		setPreco(preco);
		setPreferencia(preferencia);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(int preferencia) {
		this.preferencia = preferencia;
	}
}