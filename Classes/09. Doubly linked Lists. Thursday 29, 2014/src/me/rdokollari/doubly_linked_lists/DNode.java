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
 * Node of a doubly linked list of strings
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 30, 2014
 */
public class DNode
{

	private String element; // String element stored by a node
	private DNode next, prev; // Pointers to next and previous ndoes

	/**
	 * Constructors that creates a node with given fields.
	 * 
	 * @param element
	 * @param next
	 * @param prev
	 */
	public DNode(String element, DNode next, DNode prev) {
		setElement(element);
		setNext(next);
		setPrev(prev);
	}

	/**
	 * @return the element
	 */
	public String getElement() {
		return element;
	}

	/**
	 * @param element
	 *           the element to set
	 */
	public void setElement(String element) {
		this.element = element;
	}

	/**
	 * @return the next
	 */
	public DNode getNext() {
		return next;
	}

	/**
	 * @param next
	 *           the next to set
	 */
	public void setNext(DNode next) {
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public DNode getPrev() {
		return prev;
	}

	/**
	 * @param prev
	 *           the prev to set
	 */
	public void setPrev(DNode prev) {
		this.prev = prev;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[DNode = " + getElement() + "]";
	}

}