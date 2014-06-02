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
package me.rdokollari.doubly_linked_lists;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 30, 2014
 */
public class DList {
	private DNode header;
	private DNode trailer;
	private long size;

	public DList() throws Exception {
		setHeader(new DNode(null, null, null));
		setTailer(new DNode(null, null, null));
		getHeader().setNext(getTrailer());
		setSize(0);
	}

	public DNode getFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is empty");
		}
		return getHeader().getNext();
	}

	public DNode getLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is empty");
		}
		return getTrailer().getPrev();
	}

	/**
	 * Returns the node before the given node v.
	 * 
	 * @param node
	 * @return
	 */
	public DNode getPrev(DNode node) throws IllegalArgumentException {
		if (node == getHeader()) {
			throw new IllegalArgumentException(
					"Cannot move back past the header of the list");
		}
		return node.getPrev();
	}

	/**
	 * Inserts the given node z before the given node v. An error occurs if v is
	 * the header
	 * 
	 * 
	 * 
	 * @param existingNode
	 * @param newNode
	 * @throws Exception
	 *             , IllegalArgumentException
	 */
	public void addBefore(DNode existingNode, DNode newNode) throws Exception,
			IllegalArgumentException {
		DNode existingNodePrev = getPrev(existingNode);
		newNode.setPrev(existingNodePrev);
		newNode.setNext(existingNode);
		existingNode.setPrev(newNode);
		existingNodePrev.setNext(newNode);
		increaseSize();
	}

	public void addAfter(DNode existingNode, DNode newNode) throws Exception,
			IllegalArgumentException {
		DNode existingNodeNext = existingNode.getNext();
		newNode.setPrev(existingNode);
		newNode.setNext(existingNodeNext);
		existingNodeNext.setPrev(newNode);
		existingNode.setNext(newNode);
		increaseSize();
	}

	/**
	 * Removes the given node v from the list. An error occurs if v is the
	 * header or trailer
	 * 
	 * @param node
	 * @throws Exception
	 *             , IllegalArgumentException
	 */
	public void remove(DNode node) throws Exception, IllegalArgumentException {
		DNode nodePrev = getPrev(node);
		DNode nodeNext = getNext(node);

		// unlink the node from the list
		nodeNext.setPrev(nodePrev);
		nodePrev.setNext(nodeNext);
		node.setPrev(null);
		node.setNext(null);
		decreaseSize();
	}

	/**
	 * Returns whether a given node has a previous node
	 * 
	 * @param node
	 * @return
	 */
	public boolean hasPrev(DNode node) {
		return node != getHeader();
	}

	/**
	 * Returns whether a given node has a next node
	 * 
	 * @param node
	 * @return
	 */
	public boolean hasNext(DNode node) {
		return node != getTrailer();
	}

	/**
	 * Returns the node after the given node v
	 * 
	 * @param node
	 * @return
	 */
	public DNode getNext(DNode node) {
		if (node == getTrailer()) {
			throw new IllegalArgumentException(
					"Cannot move forward past the traielr of the list.");
		}
		return node.getNext();
	}

	/**
	 * Removing the last node of a doubly linked list. Variable size keeps track
	 * of the current number of elements in the list. Note that this method
	 * works also if the list has size one.
	 * 
	 * @throws Exception
	 */
	public void removeLast() throws Exception {
		if (getSize() == 0) {
			throw new IllegalStateException("List is empty.");
		}

		DNode tempLastNode = getTrailer().getPrev();
		DNode tempLastNodePrev = tempLastNode.getPrev();

		// point tail to (future)last node
		getTrailer().setPrev(tempLastNodePrev);
		// point (future)last node to tail
		tempLastNodePrev.setNext(getTrailer());

		// remove last node
		tempLastNode.setNext(null);
		tempLastNode.setPrev(null);
		decreaseSize();
	}

	public void decreaseSize() throws Exception {
		setSize(getSize() - 1);
	}

	/**
	 * Inserts the given node at the head of the list
	 * 
	 * @param newNode
	 * @throws Exception
	 */
	public void addFirst(DNode newNode) throws Exception {
		addAfter(getHeader(), newNode);
	}

	/**
	 * Inserts the given node at the head of the list
	 * 
	 * @param newNode
	 * @throws Exception
	 */
	public void addLast(DNode newNode) throws Exception {
		addBefore(getTrailer(), newNode);
	}

	/**
	 * @throws Exception
	 * 
	 */
	private void increaseSize() throws Exception {
		setSize(getSize() + 1);
	}

	/**
	 * @return the head
	 */
	public DNode getHeader() {
		return header;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHeader(DNode head) {
		this.header = head;
	}

	/**
	 * @return the tail
	 */
	public DNode getTrailer() {
		return trailer;
	}

	/**
	 * @param tail
	 *            the tail to set
	 */
	public void setTailer(DNode tail) {
		this.trailer = tail;
	}

	/**
	 * @return the size
	 */
	public long getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(long size) throws Exception {
		if (size < 0) {
			throw new Exception("Minimum size cannot exceed 0.");
		}
		this.size = size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String string = "[";
		DNode node = getHeader().getNext();
		DNode trailer = getTrailer();

		while (node != trailer) {
			string += node.getElement();
			node = node.getNext();
			if (node != trailer) {
				string += ", ";
			}
		}

		return string + "]";
	}

}
