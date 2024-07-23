package Tree.Exercise;

import Tree.BinarySearchTrees;

public class InsertExercise {
	public static void main(String[] args) {
		BinarySearchTrees myBST = new BinarySearchTrees();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        
        
        System.out.println("Root: " + myBST.getRoot().getValue());
        System.out.println("\nRoot->Left: " + myBST.getRoot().getLeft().getValue());
        System.out.println("\nRoot->Right: " +myBST.getRoot().getRigth().getValue());
	}
}
