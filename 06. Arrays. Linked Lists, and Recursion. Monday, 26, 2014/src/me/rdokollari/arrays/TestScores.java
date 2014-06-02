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

import java.util.Scanner;

/**
 * INSERTION SORT WORKS FAST WHEN WORKS AT END OF ARRAY
 * 
 * SCORE.
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 26, 2014
 */
public class TestScores {
	private Scores scores;
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		new TestScores();
	}

	public TestScores() {
		GameEntry tempGameEntry;

		while (true) {
			initScores();

			promptInput("Please insert your score");
			int score = getInputScore();

			promptInput("Please enter your name");
			String name = getInputName();

			tempGameEntry = new GameEntry(name, score);
			try {
				scores.add(score);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	/**
	 * @return
	 */
	private String getInputName() {
		return scanner.next();
	}

	/**
	 * @return
	 */
	private int getInputScore() {
		return scanner.nextInt();
	}

	/**
	 * 
	 */
	private void initScores() {
		scores = new Scores();
	}

	/**
	 * 
	 */
	private void promptInput(String message) {
		System.out.println(message);
	}
}
