package LinkedList.exercicios;

import LinkedList.LinkedList;

public class RemoveFirstExercise {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(2);
        myLinkedList.append(1);
       
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().getValor());
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().getValor());
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());
        
        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */
	}
}
