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
public class TestDList {

	public static void main(String[] args) {
		test_defaultConstructor();
		test_addFirst();
		test_getLast();
		test_getPrev();
		test_addBefore();
		test_addAfter();
		test_remove();
		test_removeLast();
	}

	/**
	 * 
	 */
	private static void test_removeLast() {
		try {
			DList dList = new DList();
			DNode nodeA = new DNode("A", null, null);
			DNode nodeB = new DNode("B", null, null);
			DNode nodeC = new DNode("C", null, null);

			// TODO: TEST USING ADDlAST (FAILED CURRENLTY)
			dList.addFirst(nodeA);
			dList.addFirst(nodeB);
			dList.addFirst(nodeC);

			dList.removeLast();

			System.out.println("dList: " + dList);
			System.out.println("=======> end: test_removeLast()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_remove() {
		try {
			DList dList = new DList();
			DNode nodeA = new DNode("A", null, null);
			DNode nodeB = new DNode("B", null, null);
			DNode nodeC = new DNode("C", null, null);

			// TODO: TEST USING ADDlAST (FAILED CURRENLTY)
			dList.addFirst(nodeA);
			dList.addFirst(nodeB);
			dList.addFirst(nodeC);

			dList.remove(nodeB);

			System.out.println("dList: " + dList);
			System.out.println("=======> end: test_remove()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_addAfter() {
		try {
			DList dList = new DList();
			DNode nodeA = new DNode("A", null, null);
			DNode nodeB = new DNode("B", null, null);
			DNode nodeC = new DNode("C", null, null);
			DNode nodeD = new DNode("D", null, null);

			// TODO: TEST USING ADDlAST (FAILED CURRENLTY)
			dList.addFirst(nodeA);
			dList.addFirst(nodeB);
			dList.addFirst(nodeC);

			dList.addAfter(nodeC, nodeD);

			System.out.println("dList: " + dList);
			System.out.println("=======> end: test_addAfter()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_addBefore() {
		try {
			DList dList = new DList();
			DNode nodeA = new DNode("A", null, null);
			DNode nodeB = new DNode("B", null, null);
			DNode nodeC = new DNode("C", null, null);
			DNode nodeD = new DNode("D", null, null);

			// TODO: TEST USING ADDlAST (FAILED CURRENLTY)
			dList.addFirst(nodeA);
			dList.addFirst(nodeB);
			dList.addFirst(nodeC);

			dList.addBefore(nodeC, nodeD);

			System.out.println("dList: " + dList);
			System.out.println("=======> end: test_addBefore()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_getPrev() {
		try {
			DList dList = new DList();
			DNode nodeA = new DNode("A", null, null);
			DNode nodeB = new DNode("B", null, null);
			DNode nodeC = new DNode("C", null, null);

			// TODO: TEST USING ADDlAST (FAILED CURRENLTY)
			dList.addFirst(nodeA);
			dList.addFirst(nodeB);
			dList.addFirst(nodeC);

			System.out.println("dList.getPrev(): " + dList.getPrev(nodeA));
			System.out.println("=======> end: test_getPrev()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_getLast() {
		try {
			DList dList = new DList();
			dList.addFirst(new DNode("A", null, null));
			dList.addFirst(new DNode("B", null, null));
			dList.addFirst(new DNode("C", null, null));

			System.out.println("dList.getLast(): " + dList.getLast());
			System.out.println("=======> end: test_getLast()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_getFirst() {
		try {
			DList dList = new DList();
			dList.addFirst(new DNode("A", null, null));
			dList.addFirst(new DNode("B", null, null));
			dList.addFirst(new DNode("C", null, null));

			System.out.println("dList.getFirst(): " + dList.getFirst());
			System.out.println("=======> end: test_getFirst()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_addFirst() {
		try {
			DList dList = new DList();
			dList.addFirst(new DNode("A", null, null));
			dList.addFirst(new DNode("B", null, null));
			dList.addFirst(new DNode("C", null, null));

			System.out.println(dList);
			System.out.println("=======> end: test_addFirst()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_defaultConstructor() {
		try {
			DList dLinkedList = new DList();
			System.out.println(dLinkedList);
			System.out.println("=======> end: test_defaultConstructor()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}

	}
}
