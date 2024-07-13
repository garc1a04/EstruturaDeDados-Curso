package LinkedList.exercicios;

import LinkedList.LinkedList;

public class RemoveExercise {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("LL before remove():");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).getValor());
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).getValor());
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).getValor());
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            LL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            LL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            LL after remove() of last node:
            2
            4

        */
	}
}
