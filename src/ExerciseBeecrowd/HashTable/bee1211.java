package ExerciseBeecrowd.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class bee1211 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			int repeticoes = input.nextInt();
			String[] primeiro = input.next().split("");
			
			int i = 0;
			int maior = 0;
			while(i++ < repeticoes-1) {
				String[] restante = input.next().split("");
				int iguais = numerosEmComum(primeiro,restante);
				maior += iguais;
			}
			
			System.out.println(maior);
		}
	}
	
	public static int numerosEmComum(String[] primeiro, String[] restante) {
		int iguais = 0;
		int index = 0;
		
		ArrayList<Integer> valores = new ArrayList<>();
		
		for(String primeiroChar: primeiro) {
			valores.add(Integer.parseInt(primeiroChar));
		}
		
		
		for(String segundoChar: restante) {
			boolean condition = valores.get(0) == Integer.parseInt(restante[0]);
			
			if(Integer.parseInt(segundoChar) == valores.get(index) && condition) {
				iguais++;
			}
			
			index++;
		}
		
		return iguais;
	}
}
