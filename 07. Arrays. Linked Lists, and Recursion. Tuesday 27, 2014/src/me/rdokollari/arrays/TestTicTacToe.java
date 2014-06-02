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
package me.rdokollari.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 27, 2014
 */
public class TestTicTacToe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// test_defaultToString();
		test_game();
	}

	/**
	 * 
	 */
	private static void test_game() {
		TicTacToe ticTacToe = new TicTacToe();
		System.out.println("Game starts.");
		System.out.println("Player1 plays X, Player2 plays O\n");
		System.out.println(ticTacToe);
		ticTacToe.showWinner();
	}

	/**
	 * 
	 */
	private static void test_defaultToString() {
		TicTacToe ticTacToe = new TicTacToe();
		System.out.println(ticTacToe);
	}

}
