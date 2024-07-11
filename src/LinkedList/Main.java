package LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().getValor());
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().getValor());
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());
        
        
	}
}
