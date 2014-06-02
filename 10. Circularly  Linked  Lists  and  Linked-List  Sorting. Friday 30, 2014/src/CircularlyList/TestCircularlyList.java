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
package CircularlyList;

import java.util.Random;

import me.rdokollari.circularly_linked_list.CircularlyList;
import me.rdokollari.single.Node;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 30, 2014
 */
public class TestCircularlyList {

	public static void main(String[] args) {
		test_defaultConstructor();
		test_add();

		test_game();
	}

	/**
	 * 
	 */
	private static void test_game() {
		try {
			Random random = new Random();
			CircularlyList players = new CircularlyList();
			players.add(new Node("1. John"));
			players.add(new Node("2. Harry"));
			players.add(new Node("3. Lily"));
			players.add(new Node("4. Olivia"));
			players.add(new Node("5. Emma"));
			players.add(new Node("6. Ethan"));
			players.add(new Node("7. James"));
			players.add(new Node("8. Lily"));

			Node oldCursor = players.getCursorNode();
			// for (players.advanceCursor(); oldCursor !=
			// players.getCursorNode(); players
			// .advanceCursor()) {
			// }
			for (int i = 0; i < random.nextInt(players.getSize()); i++) {

			}

			System.out.println("players: " + players);
			System.out.println("=======> end: test_game()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}

	}

	/**
	 * 
	 */
	private static void test_add() {
		try {
			CircularlyList circularlyList = new CircularlyList();
			circularlyList.add(new Node("1. John"));
			circularlyList.add(new Node("2. Harry"));
			circularlyList.add(new Node("3. Lily"));
			circularlyList.add(new Node("4. Olivia"));
			circularlyList.add(new Node("5. Emma"));
			circularlyList.add(new Node("6. Ethan"));
			circularlyList.add(new Node("7. James"));
			circularlyList.add(new Node("8. Lily"));

			System.out.println("circularlyList: " + circularlyList);
			System.out.println("=======> end: test_add()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void test_defaultConstructor() {
		try {
			CircularlyList circularlyList = new CircularlyList();
			System.out.println("circularlyList: " + circularlyList);
			System.out.println("=======> end: test_defaultConstructor()\n\n");
		} catch (Exception e) {
			System.out.println("Test Failed: " + e.getMessage());
		}
	}
}
