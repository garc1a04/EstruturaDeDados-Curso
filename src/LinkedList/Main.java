package LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList minhaLinkedList = new LinkedList();
		minhaLinkedList.append(2);
		minhaLinkedList.append(5);
		minhaLinkedList.append(7);
		minhaLinkedList.append(3);
		minhaLinkedList.append(6);
		minhaLinkedList.append(8);
		
		minhaLinkedList.removeFirst();
		minhaLinkedList.removeLast();
		minhaLinkedList.remove(1);
		
		minhaLinkedList.insert(1, 1);
		minhaLinkedList.set(3, 5);
		
		minhaLinkedList.printList();
	}
}
