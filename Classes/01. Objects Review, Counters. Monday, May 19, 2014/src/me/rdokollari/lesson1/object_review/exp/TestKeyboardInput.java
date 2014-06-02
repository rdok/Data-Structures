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
package me.rdokollari.lesson1.object_review.exp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * TODO: tomorrow, input until enter key pressed.
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 19, 2014
 */
public class TestKeyboardInput {

	private Scanner scanner = new Scanner(System.in);
	private final int TOT_NUM = 10;

	public static void main(String[] args) {
		new TestKeyboardInput();
	}

	public TestKeyboardInput() {
		// 0 ends
		int[] x = new int[TOT_NUM];
		boolean numberIsAdded;
		boolean manualTerminate = false;
		String userInput;

		for (int i = 0; i < x.length; i++) {
			numberIsAdded = false;

			System.out
					.println("Please enter a integer number or 'Enter' button for exit");

			// while user inputs not acceptable keys, loop
			while (!numberIsAdded) {
				try {
					userInput = scanner.nextLine();
					// if user presses enter key, terminate input key process
					if (userInput.equals("")) {
						manualTerminate = true;
						break; // break out of while loop
					} else {
						x[i] = Integer.parseInt(userInput);
					}
					numberIsAdded = true; // acceptable key input
				} catch (Exception InputMismatchException) {
					System.out
							.println("Only integer numbers are accepeted. Please re try.");
				}
			}

			// terminate input process if user pressed enter key
			if (manualTerminate) {
				break;
			}
		}

		System.out.println(Arrays.toString(x));
	}
}
