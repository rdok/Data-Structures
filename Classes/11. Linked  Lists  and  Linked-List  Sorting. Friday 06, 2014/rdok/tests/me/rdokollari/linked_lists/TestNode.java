package me.rdokollari.linked_lists;

public class TestNode {
	public static void main(String[] args) {
		Node x = new Node("Node x");
		Node y = new Node("Node y");

		try {
			y.insertNode(x, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(y.getNodeWithIndex(0));

	}// end of main()

}
