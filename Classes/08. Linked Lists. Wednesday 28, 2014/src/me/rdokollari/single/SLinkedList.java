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
package me.rdokollari.single;

/**
 * add first,
 * 
 * add last,
 * 
 * remove first()
 * 
 * remove last
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 28, 2014
 */
public class SLinkedList {
	private Node head;
	private long size;
	private Node tail;

	/**
	 * @param head
	 * @param size
	 */
	public SLinkedList(Node head, long size) {
		setHead(head);
		setSize(size);
	}

	/**
	 * 
	 */
	public SLinkedList() {
		this(null, 0);
	}

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
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
	public void setSize(long size) {
		this.size = size;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SLinkedList [head=" + head + ", size=" + size + ", tail="
				+ tail + "]";
	}

	/**
	 * @param nodeA
	 */
	public void addFirst(Node head) {
		// if getHead() return null, the head point to
		head.setNext(getHead());
		setHead(head);

		if (getSize() == 0) {
			setTail(head);
		}
		increaseSize();
	}

	/**
	 * @param nodeB
	 */
	public void addLast(Node tail) {
		if (getTail() != null) {
			getTail().setNext(tail);
		} else {
			setHead(tail);
		}
		tail.setNext(null);
		setTail(tail);
		increaseSize();
	}

	/**
	 * 
	 */
	private void increaseSize() {
		setSize(getSize() + 1);
	}

	/**
	 * @return the tail
	 */
	public Node getTail() {
		return tail;
	}

	/**
	 * @param tail
	 *            the tail to set
	 */
	public void setTail(Node tail) {
		this.tail = tail;
	}

	/**
	 * @param nodeB
	 */
	public boolean removeFirst() {
		if (getHead() == null) {
			return false;
		}
		Node tempHead = getHead();
		setHead(getHead().getNext());
		// clear setNext of original header
		tempHead.setNext(null);
		decreaseSize();

		return true;
	}

	/**
	 * 
	 */
	private void decreaseSize() {
		setSize(getSize() - 1);
	}
}
