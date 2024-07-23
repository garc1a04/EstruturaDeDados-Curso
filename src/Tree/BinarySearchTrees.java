package Tree;

public class BinarySearchTrees {
	
	private Node root;

	public BinarySearchTrees(int value) {
		Node newNode = new Node(value);
		root = newNode;
	}
	
	public BinarySearchTrees() {}

	public boolean insert(int value) {
		Node newNode = new Node(value);
		
		if(root == null) {
			root = newNode;
			return true;
		}
		
		Node temp = root;
		
		while(true) {
			if(newNode == temp) return false;
			
			if(newNode.getValue() < temp.getValue()) {
				
				if(temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				
				temp = temp.getLeft();
			} else {
				if(temp.getRigth() == null) {
					temp.setRigth(newNode);
					return true;
				}
				
				temp = temp.getRigth();
			}
		}
		
		
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
}
