package Queues.Exercise;

import Queues.Queue;

public class ConstructorExercise {
	public static void main(String[] args) {
		Queue myQueue = new Queue(4);

		System.out.println(myQueue.getFirst().getValue());
		System.out.println(myQueue.getLast().getValue());
		System.out.println(myQueue.getLength());

        System.out.println("\nQueue:");
        myQueue.printQueue();
	}
}
