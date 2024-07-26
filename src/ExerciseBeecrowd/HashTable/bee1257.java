package ExerciseBeecrowd.HashTable;

import java.util.Scanner;

public class bee1257 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repeticoes = input.nextInt();
		int i  = 0;
		while(i++ < repeticoes) {
			int quantidadeValores = input.nextInt();
			
			int valor = 0;
			for(int index = 0; index < quantidadeValores;index++) {
				String palavras = input.next();
				valor+= hash(palavras,index);
			}
			
			System.out.println(valor);
		}
	}
	
	public static int hash(String key,int elementoDeEntrada) {
		int hash = 0;
		char[] keyChar = key.toCharArray();
		
		for(int i = 0;i < keyChar.length;i++) {
			int posicaoAlfabeto = keyChar[i]-65;
			
			hash += (posicaoAlfabeto+ i + elementoDeEntrada);
		}
		
		
		return hash;
	}
}


