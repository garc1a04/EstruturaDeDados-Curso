package Stacks.Exercise;

import Stacks.Stack;

public class ConstrutorExercise {
	public static void main(String[] args) {
		Stack myStack = new Stack(4);

		System.out.println(myStack.getTop());
        System.out.println(myStack.getHeight());

        System.out.println("\nStack:");
        myStack.printStack();
	}
}
