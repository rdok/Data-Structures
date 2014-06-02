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
package me.rdokollari.part_a;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * Sources:
 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-
 * problem/
 * 
 * http://cse.unl.edu/~goddard/Courses/CSCE310J/Lectures/Lecture8-
 * DynamicProgramming.pdf
 * 
 * https://www.youtube.com/watch?v=wFP5VHGHFdk
 * 
 * http://ideone.com/mFaz8X
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 31, 2014
 */
public class Knapsack
{
	private int[] weights;
	private int[] values;
	private int capacity;
	private int[][] optimalBackPack;

	public Knapsack(int[] weights, int[] values, int capacity) {
		setWeights(weights);
		setValues(values);
		setCapacity(capacity);

	}

	/**
	 * Returns the max value from an 1-dimensional array.
	 * 
	 * @param weights2
	 * @return
	 */
	private int getMaxOf(int[] weights) {
		int maxWeight = 0;

		for (int weight : weights) {
			if (weight > maxWeight) {
				maxWeight = weight;
			}
		}

		return maxWeight;
	}

	/**
	 * @return the weights
	 */
	public int[] getWeights() {
		return weights;
	}

	/**
	 * @param weights
	 *           the weights to set
	 */
	public void setWeights(int[] weights) {
		this.weights = weights;
	}

	/**
	 * @return the values
	 */
	public int[] getValues() {
		return values;
	}

	/**
	 * @param values
	 *           the values to set
	 */
	public void setValues(int[] values) {
		this.values = values;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity
	 *           the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * 
	 */
	public String getMatrix(String title, int[][] matrix) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(title).append(":\n");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {
				stringBuilder.append(matrix[i][j]).append("\t");
			} // end inner for
			stringBuilder.append("\n");
		} // end outer for

		return stringBuilder.toString();
	}

	/**
	 * @return the optimalBackPack
	 */
	public int[][] getOptimalBackPack() {
		return optimalBackPack;
	}

	/**
	 * @param optimalBackPack
	 *           the optimalBackPack to set
	 */
	public void setOptimalBackPack(int[][] optimalBackPack) {
		this.optimalBackPack = optimalBackPack;
	}

	/**
	 * 
	 */
	public int getRecursiveOptimalValue() {
		return getRecursiveKnapsack(getCapacity(), getWeights(), getValues(),
				getValues().length);
	}

	public String getDynamicProgramming() {
		return getMatrix("Matrix Table",
				getDynamicKnapsackMatrix(getCapacity(), getWeights(), getValues()));
	}

	/**
	 * @param capacity2
	 * @param weights2
	 * @param values2
	 * @param length
	 * @return
	 */
	public int getDynamicOptimalValue() {
		return getDynamicKnapsackMatrix(getCapacity(), getWeights(), getValues())[getValues().length][getCapacity()];
	} // end method getDynamicKnapsack

	public int[][] getMatrix() {
		return getDynamicKnapsackMatrix(getCapacity(), getWeights(), getValues());
	}

	/**
	 * @param backpackCapacity
	 * @param weights
	 * @param values
	 * @param totItems
	 * @param matrix
	 */
	public int[][] getDynamicKnapsackMatrix(int backpackCapacity, int[] weights,
			int[] values) {
		int totItems = values.length;
		int[][] matrix = new int[totItems + 1][backpackCapacity + 1];

		for (int item = 0; item < totItems; item++) {
			matrix[item][0] = 0;
		}

		for (int weight = 0; weight < totItems; weight++) {
			matrix[0][weight] = 0;
		}

		// bottom up manner
		for (int item = 1; item <= totItems; item++) {

			for (int weight = 0; weight <= backpackCapacity; weight++) {

				if (weights[item - 1] <= weight) {
					matrix[item][weight] = Math.max(values[item - 1]
							+ matrix[item - 1][weight - weights[item - 1]],
							matrix[item - 1][weight]);
				} else {
					matrix[item][weight] = matrix[item - 1][weight];
				} // end else
			} // end inner for
		} // end outer for

		return matrix;
	}

	/**
	 * @param capacity
	 * @param weights
	 * @param values
	 * @param totItems
	 * @return
	 */
	public int getRecursiveKnapsack(int backpackCapacity, int[] weights,
			int[] values, int totItems) {

		// base case -- no space on backpack or no more items
		if (backpackCapacity == 0 || totItems == 0) {
			return 0;
		}

		// if n-th item's weight greater than backpack capacity, then the backpack
		// cannot hold it
		if (weights[totItems - 1] > backpackCapacity) {
			return getRecursiveKnapsack(backpackCapacity, weights, values,
					totItems - 1);
		} else {
			// return the max of: n-th item is included, not included
			return Math.max(
					values[totItems - 1]
							+ getRecursiveKnapsack(backpackCapacity
									- weights[totItems - 1], weights, values,
									totItems - 1),
					getRecursiveKnapsack(backpackCapacity, weights, values,
							totItems - 1));

		}
	}

}
