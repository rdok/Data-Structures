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

import java.util.Random;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 28, 2014
 */
public class TestSLinkedList {

	public static void main(String[] args) {
		// test_Constructor();
		// test_addLast();

		// not tested
		test_addFirst();
		test_removeFirst();

		// 1000, random int generator.
		test_Trainning();
	}

	/**
	 * 65, +26
	 */
	private static void test_Trainning() {
		long initFreeMemory, initTotalMemory;
		long startTime = System.nanoTime();

		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		initFreeMemory = (long) runtime.freeMemory();
		initTotalMemory = (long) runtime.totalMemory();

		SLinkedList sLinkedList = new SLinkedList();
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		for (int i = 0; i < 100000; i++) {
			sLinkedList.addLast(new Node((char) (65 + random.nextInt(26)) + "",
					null));
			System.out.print(sLinkedList.getTail());
			if (i % 150 == 0) {
				System.out.println();
			}
		}

		long endTime = System.nanoTime();

		System.out.println("\nProgram execution time: " + (endTime - startTime)
				/ 1000000 + " milli-seconds");
		System.out.println(sLinkedList);
		System.out.println("Initial Free memory: " + initFreeMemory);
		System.out.println("Initial Total memory: " + initTotalMemory);
		System.out.println("Initial Program usage: "
				+ (initTotalMemory - initFreeMemory));

		initFreeMemory = (long) runtime.freeMemory();
		initTotalMemory = (long) runtime.totalMemory();
		System.out.println("Free memory: " + initFreeMemory);
		System.out.println("Total memory: " + initTotalMemory);
		System.out.println("Program usage: "
				+ (initTotalMemory - initFreeMemory));

	}

	/**
	 * 
	 */
	private static void test_removeFirst() {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	private static void test_addFirst() {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	private static void test_addLast() {
		Node nodeA = new Node("A", null);
		Node nodeB = new Node("B", null);
		Node nodeC = new Node("C", null);
		SLinkedList sLinkedList = new SLinkedList();

		sLinkedList.addLast(nodeB);
		sLinkedList.addLast(nodeA);
		System.out.println(sLinkedList);
	}

	/**
	 * 
	 */
	private static void test_Constructor() {
		Node nodeA = new Node("A", null);
		Node nodeB = new Node("B", null);
		Node nodeC = new Node("C", null);
		SLinkedList sLinkedList = new SLinkedList();
		// System.out.println(sLinkedList);
		//
		// sLinkedList.addFirst(nodeA);
		// System.out.println(sLinkedList);
		//
		// sLinkedList.addLast(nodeB);
		// System.out.println(sLinkedList);
		//
		// sLinkedList.addLast(nodeC);
		// System.out.println(sLinkedList);
		//
		// sLinkedList.removeFirst();
		// System.out.println(sLinkedList);

	}
}
