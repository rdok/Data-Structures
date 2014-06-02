package me.rdokollari.arrays;

import java.util.Arrays;

public class ScoresInClassWork {

	/**
	 * @param args
	 */
	static int[] scores = new int[10];
	static int numOfScores = 0;

	public static void main(String[] args) {
		System.out.println(Arrays.toString(scores));

		System.out.println("Score Position :" + add(11));
		System.out.println(Arrays.toString(scores));

		System.out.println("Score Position :" + add(3));
		System.out.println("num of Scores: " + numOfScores);
		System.out.println(Arrays.toString(scores));

		System.out.println("Score Position :" + add(99));
		System.out.println("num of Scores: " + numOfScores);
		System.out.println(Arrays.toString(scores));

		System.out.println("Score Position :" + add(8));
		System.out.println("Score Position :" + add(56));
		System.out.println("Score Position :" + add(42));
		System.out.println("Score Position :" + add(42));
		System.out.println("num of Scores: " + numOfScores);
		System.out.println(Arrays.toString(scores));

		System.out.println("Remove Score:" + remove(42));
		System.out.println(Arrays.toString(scores));

	}

	public static int add(int newScore) {
		if (numOfScores == scores.length
				&& scores[scores.length - 1] > newScore)
			return 0;
		else {
			if (numOfScores < scores.length)
				numOfScores++;
			int i = numOfScores - 1;
			for (; (i >= 1) && scores[i - 1] < newScore; i--) {
				scores[i] = scores[i - 1];
			}
			scores[i] = newScore;
			return (i + 1);
		}
	}

	public static boolean remove(int oldScore) {

		while (scoreHasNumber(oldScore)) {
			shiftToLeft(getIndexOf(oldScore));
		}

		return true;
	}

	/**
	 * @param oldScore
	 */
	private static int getIndexOf(int oldScore) {
		int index = -1; // error
		for (int i = numOfScores; i >= 0; i--) {
			if (scores[i] == oldScore) {
				index = i;
				break;
			}
		}
		return index;

	}

	/**
	 * @param oldScore
	 * 
	 */
	private static boolean scoreHasNumber(int oldScore) {
		for (int i = numOfScores; i >= 0; i--) {
			if (scores[i] == oldScore) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param i
	 */
	private static void shiftToLeft(int index) {
		for (int i = index; i < scores.length - 1; i++) {
			scores[i] = scores[i + 1];
		}
	}
}
