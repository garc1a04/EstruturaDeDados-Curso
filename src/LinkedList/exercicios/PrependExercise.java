package LinkedList.exercicios;

import LinkedList.LinkedList;

public class PrependExercise {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList();
		myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getTail());
        System.out.println(myLinkedList.getTamanho());

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getTail());
        System.out.println(myLinkedList.getTamanho());

        System.out.println("\nLinked List:");
        myLinkedList.printList();
	}
}
