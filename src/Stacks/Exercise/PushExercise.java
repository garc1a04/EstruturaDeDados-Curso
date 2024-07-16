package Stacks.Exercise;

import Stacks.Stack;

public class PushExercise {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push(2);

        System.out.println("Before push():");
        System.out.println("--------------");
        System.out.println(myStack.getTop());
        System.out.println(myStack.getHeight());

        System.out.println("\nStack:");
        myStack.printStack();

        myStack.push(1);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        System.out.println(myStack.getTop());
        System.out.println(myStack.getHeight());

        System.out.println("\nStack:");
        myStack.printStack();
	}
}
