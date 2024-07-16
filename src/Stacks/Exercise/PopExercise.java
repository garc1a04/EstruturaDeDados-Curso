package Stacks.Exercise;

import Stacks.Stack;

public class PopExercise {
	public static void main(String[] args) {
		Stack myStack = new Stack(2);
        myStack.push(1);

        // (2) Items - Returns 1 Node
        System.out.println(myStack.pop().getValue());
        // (1) Item - Returns 2 Node
        System.out.println(myStack.pop().getValue());
        // (0) Items - Returns null
        System.out.println(myStack.pop());
	}
}
