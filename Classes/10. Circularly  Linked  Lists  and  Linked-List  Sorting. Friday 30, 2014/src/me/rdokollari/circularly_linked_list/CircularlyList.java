/*******************************************************************************
 * Copyright 2014 Rizart Dokollari
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package me.rdokollari.circularly_linked_list;

import me.rdokollari.single.Node;

/**
 * Use a 'cursor' for pointing the last element pointed. The last element point
 * the the cursor 'was' pointing.
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 30, 2014
 */
public class CircularlyList {
	private Node cursorNode;
	private Node nextNode;
	private int size;

	public CircularlyList() throws Exception {
		setCursorNode(null);
		setSize(0);
	}

	public void add(Node newNode) throws Exception {
		if (isEmpty()) {
			newNode.setNext(newNode);
			cursorNode = newNode;
		} else {
			newNode.setNext(getCursorNode().getNext());
			getCursorNode().setNext(newNode);
		}

		increaseSize();
	}

	public void remove() throws Exception {
		Node oldNode = getCursorNode().getNext();

		if (oldNode == getCursorNode()) {
			setCursorNode(null);
		} else {
			getCursorNode().setNext(oldNode.getNext());
			oldNode.setNext(null);
		}

		decreaseSize();
	}

	/**
	 * @throws Exception
	 * 
	 */
	private void decreaseSize() throws Exception {
		setSize(getSize() - 1);
	}

	/**
	 * @throws Exception
	 * 
	 */
	private void increaseSize() throws Exception {
		setSize(getSize() + 1);
	}

	/**
	 * @return
	 */
	private boolean isEmpty() {
		if (getSize() > 0) {
			return false;
		}
		return true;
	}

	// advanced cursose
	public void advanceCursor() {
		setCursorNode(cursorNode.getNext());
	}

	/**
	 * @return the cursorNode
	 */
	public Node getCursorNode() {
		return cursorNode;
	}

	/**
	 * @param cursorNode
	 *            the cursorNode to set
	 */
	public void setCursorNode(Node cursorNode) {
		this.cursorNode = cursorNode;
	}

	/**
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}

	/**
	 * @param nextNode
	 *            the nextNode to set
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 * @throws Exception
	 */
	public void setSize(int size) throws Exception {
		if (size < 0) {
			throw new Exception("Minimum size cannnot exceed 0.");
		}
		this.size = size;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String string = "";

		if (isEmpty()) {
			string = "[]";
		} else {

			string = "[ " + getCursorNode().getElement();
			Node oldCursor = getCursorNode();

			for (advanceCursor(); oldCursor != getCursorNode(); advanceCursor()) {
				string += ", " + getCursorNode().getElement();
			}

			string += " ]";
		}
		return string;
	}
}
