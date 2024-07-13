package LinkedList.exercicios;

import LinkedList.LinkedList;

public class ReverseExercise {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2); 
        myLinkedList.append(3);
        myLinkedList.append(4);

        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();
        

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4
            
            LL after reverse():
            4
            3
            2
            1

        */
	}
}
