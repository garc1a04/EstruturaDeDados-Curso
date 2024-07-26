package Tree;

public class Main {
	public static void main(String[] args) {
		BinarySearchTrees arvore = new BinarySearchTrees();
		
		arvore.insert(5);
		arvore.insert(1);
		arvore.insert(2);
		arvore.insert(3);
		arvore.insert(7);
		arvore.insert(8);
		arvore.insert(9);
		arvore.insert(10);
		arvore.insert(4);
		
		System.out.println(arvore.contains(20));
	}
}
