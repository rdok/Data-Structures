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
package me.rdokollari.lesson1.object_review;

import java.util.Arrays;
import java.util.Scanner;

/**
 * TODO: tomorrow, input until enter key pressed.
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 19, 2014
 */
public class TestKeyboardInput {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 0 ends
		int[] x = new int[10];

		for (int i = 0; i < x.length; i++) {

			System.out
					.println("Please enter a integer number or enter for exit");
			// TODO: not integer exception
			System.out.println(x[i]);
			try {
				x[i] = scanner.nextInt();
			} catch (Exception InputMismatchException) {
				System.out
						.println("Only integer numbers are accpeted. Please re try.");
			}

		}

		System.out.println(Arrays.toString(x));
	}
}
