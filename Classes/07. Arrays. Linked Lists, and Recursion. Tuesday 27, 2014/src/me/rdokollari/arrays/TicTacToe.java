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

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 27, 2014
 */
public class TicTacToe {

	private int[][] ticTacToe;

	public TicTacToe() {
		int[][] emptyTicTacToe = { { 1, -1, -1 }, { -1, 1, 0 }, { 1, 1, 1 } };
		setTicTacToe(emptyTicTacToe);
	}

	/**
	 * @return the ticTacToe
	 */
	public int[][] getTicTacToe() {
		return ticTacToe;
	}

	/**
	 * @param ticTacToe
	 *            the ticTacToe to set
	 */
	public void setTicTacToe(int[][] ticTacToe) {
		this.ticTacToe = ticTacToe;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		int[][] currTicTacToe = getTicTacToe();
		String output = "";

		// loop through each row
		for (int i = 0; i < currTicTacToe.length; i++) {
			int[] currRow = currTicTacToe[i];

			// loop through each column
			for (int j = 0; j < currRow.length; j++) {
				output += (j == 1) ? "|" : "";
				output += convertToSymbol(currRow[j]);
				output += (j == 1) ? "|" : "";
			}
			output += (i == 2) ? "" : "\n=====\n";
		}
		return output;
	}

	/**
	 * @param i
	 * @return
	 * @throws Exception
	 */
	private String convertToSymbol(int i) {
		String output = null;
		// String case = Integer.parseInt(i);

		switch (i) {
		case -1:
			output = "X";
			break;
		case 0:
			output = " ";
			break;
		case 1:
			output = "O";
			break;
		default:
			// throw new Exception("Something went terribly wrong");
		}
		return output;
	}

	/**
	 * 
	 */
	public void showWinner() {
		String output = "";
		switch (getLargestScoreWinner()) {
		case -3:
			output = "Player1 wins";
			break;
		case 3:
			output = "Player2 wins";
			break;
		default:
			output = "Game not yet finished.";
		}

		System.out.print(output);
	}

	/**
	 * @return
	 */
	private boolean containsWinner() {
		boolean winnerFound = false;
		int winner;

		winner = getLargestScoreWinner();

		if (winner == 3 || winner == -3) {
			winnerFound = true;
		}

		return winnerFound;
	}

	/**
	 * @return
	 */
	private int getLargestScoreWinner() {
		int countColumnScore[] = { 0, 0, 0 };
		int countRowScore[] = { 0, 0, 0 };
		int diagonalSCoreLeftToRightScore = 0;
		int diagonalSCoreRightToLeftScore = 0;

		for (int i = 0; i < ticTacToe.length; i++) {
			int[] rowTicTacToe = ticTacToe[i];

			// checking rows
			for (int j = 0; j < rowTicTacToe.length; j++) {

				// count diagonalSCoreLeftToRight
				if (i == j) {
					diagonalSCoreLeftToRightScore += ticTacToe[i][j];
				}

				if (i + j == 2) {
					diagonalSCoreRightToLeftScore += ticTacToe[i][j];
				}

				countRowScore[i] += rowTicTacToe[j];
				countColumnScore[i] += ticTacToe[j][i];
			}
		}

		int maxScores[] = { getLargestNumber(countColumnScore),
				getLargestNumber(countRowScore), diagonalSCoreLeftToRightScore,
				diagonalSCoreRightToLeftScore };
		return getLargestNumber(maxScores);
	}

	/**
	 * largest +/-
	 * 
	 * @param array
	 * @return
	 */
	private int getLargestNumber(int[] array) {
		int output = 0;

		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) > Math.abs(output)) {
				output = array[i];
			}
		}

		return output;
	}
}
