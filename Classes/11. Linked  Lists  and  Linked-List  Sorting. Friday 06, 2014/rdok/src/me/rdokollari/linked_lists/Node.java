package me.rdokollari.linked_lists;

public class Node {
	String element;
	Node next;

	public Node() {
		setElement("");
		setNext(null);
	}

	public Node(String element) {
		setElement(element);
	}

	public void addNode() {
		if (next == null) {
			setNext(new Node());
		} else {
			next.addNode();
		}
	}

	public void deleteLast() {
		if (next != null) {
			if (next.getNext() == null) {
				setNext(null);
			} else {
				next.deleteLast();
			}
		}
	}

	public void insertNode(Node atNode, Node newNode) {
		Node tempAtNodeNext = atNode.getNext();
		atNode.setNext(newNode);
		newNode.setNext(tempAtNodeNext);
	}

	public void insertNode(Node newNode, int index) throws Exception {
		if (index < 0) {
			throw new Exception("index must be greater than 0");
		} else if (index > length()) {
			throw new Exception("index cannot be greater than list length");
		}

		Node insertNodeAt = this;

		// Node tempAtNodeNext = atNode.getNext();
		// atNode.setNext(newNode.getNext);
		// newNode.setNext(tempAtNodeNext);
	}

	/**
	 * vagianout:
	 * 
	 * public void insertNode(Node n, int index){ if ((index > llength())||
	 * index <0) System.out.println ("Invalid index!"); else { Node current =
	 * next; for (int i=1; i<index; i++) current = current.getNext();
	 * 
	 * n.setNext(current.getNext()); current.setNext(n);
	 * 
	 * } }
	 * 
	 * @param index
	 * @return
	 */
	public Node getNodeWithIndex(int index) {
		Node tempNode = this;

		// start from 1 scine next has index 0.
		for (int i = 1; i < index; i++) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public int length() {
		int length = 1;

		if (next != null) {
			return length + next.length();
		}
		return length;
	}

	public void setElement(String e) {
		element = e;
	}

	public void setNext(Node n) {
		next = n;
	}

	public String getElement() {
		return element;
	}

	public Node getNext() {
		return next;
	}

	@Override
	public String toString() {
		return "Node [element=" + element + ", next=" + next + "]";
	}

}