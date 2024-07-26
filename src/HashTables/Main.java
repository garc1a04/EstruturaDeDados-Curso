package HashTables;

public class Main {
	public static void main(String[] args) {
		HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println(myHashTable.keys());
	}
}
