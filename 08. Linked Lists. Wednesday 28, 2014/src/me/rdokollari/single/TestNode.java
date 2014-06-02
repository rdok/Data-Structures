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
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 28, 2014
 */
public class TestNode {

	public static void main(String[] args) {
		test_Constructor();
	}

	/**
	 * 
	 */
	private static void test_Constructor() {
		Node nodeX = new Node("X", null);
		Node nodeA = new Node("A", null);
		Node nodeB = new Node("B", null);
		Node nodeC = new Node("C", null);
		Node nodeD = new Node("D", null);

		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);
		nodeX.setNext(nodeA);

		System.out.println(nodeA);
		System.out.println(nodeB);
		System.out.println(nodeC);
		System.out.println(nodeX);
		System.out.println(nodeD);

	}

}
