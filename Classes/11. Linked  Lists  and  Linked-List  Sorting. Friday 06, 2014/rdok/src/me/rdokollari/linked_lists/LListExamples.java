package me.rdokollari.linked_lists;

public class LListExamples {
	public static void main(String[] args) {
		Node x = new Node("Node x");
		Node y = new Node("Node y");

		x.addNode();
		x.addNode();

		y.insertNode(y, x);
		System.out.println(y);

		// x.setNext(y);
		// y=null;
	}// end of main()
}// end of class
