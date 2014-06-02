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

import java.util.Arrays;

/**
 * in which cases it's faster, in which it's slower:
 * 
 * if array big & try to insert at the beginning.
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 26, 2014
 */
public class Scores {
	private GameEntry[] entries; // array of game entries
	
	private int[] scores;
	private static final int MAX_TOT_SCORES = 3;
	private int totCurrentScores = 0;

	public Scores() {
		scores = new int[MAX_TOT_SCORES];
	}

	/**
	 * Algorithm adding scores. shifing from left to right.
	 * 
	 * @param score
	 * @throws Exception
	 */
	public void add(int newScore) throws Exception {
		if (!isScoresFull() && getLowestScore() > newScore) {
			throw new Exception("Sorry, you did not get to top ten scores");
		}

		int i = getTotCurrentScores();
		int[] scoresPointer = getScores();

		for (; (i >= 1) && scoresPointer[i - 1] < newScore; i--) {
			scoresPointer[i] = scoresPointer[i - 1];
		}
		scoresPointer[i] = newScore;
		if (getTotCurrentScores() < MAX_TOT_SCORES) {
			setTotCurrentScores(getTotCurrentScores() + 1);
		}

		// return (i + 1);
	}

	/**
	 * @param newScore
	 */
	private void addNewScore(int newScore) {
		getScores()[totCurrentScores + 1] = newScore;
		totCurrentScores++;
	}

	/**
	 * @return
	 */
	private int getLowestScore() {
		return getScores()[totCurrentScores];
	}

	/**
	 * @return the scores
	 */
	public int[] getScores() {
		return scores;
	}

	/**
	 * @param scores
	 *            the scores to set
	 */
	public void setScores(int[] scores) {
		this.scores = scores;
	}

	/**
	 * @return the totCurrentScores
	 */
	public int getTotCurrentScores() {
		return totCurrentScores;
	}

	/**
	 * @param totCurrentScores
	 *            the totCurrentScores to set
	 */
	public void setTotCurrentScores(int totCurrentScores) {
		this.totCurrentScores = totCurrentScores;
	}

	/**
	 * @return the isScoresFull
	 */
	public boolean isScoresFull() {
		return totCurrentScores == MAX_TOT_SCORES - 1 ? true : false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Scores [scores=" + Arrays.toString(scores)
				+ ", totCurrentScores=" + totCurrentScores + "]";
	}

}
