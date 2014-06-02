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

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since Jun 1, 2014
 */
public class TestBackpackPerformance
{

	private static final long MEGABYTE = 1024L * 1024L;
	private static int[] weights;
	private static int[] values;
	private static int backpackCapacity;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 testSameOptimvalValueForDynamicVSRecursive();
		//testPerformanceConsumptionRecursiveProgramming();
		//testPerformanceConsumptionDynamicProgramming();

	}

	/**
	 * prepares values for testing.
	 */
	private static void setUp() {
		int[] weights =
		{ 10, 3, 4, 1, 6, 9, 0, 3, 4, 3, 6, 9, 10, 13, 9, 3, 6, 9, 10, 3, 4, 31,
				6, 9, 10, 3, 4, 1, 6, 9, 0 };
		int[] values =
		{ 2, 3, 4, 5, 10, 5, 10, 3, 4, 3, 6, 9, 10, 3, 4, 3, 6, 9, 10, 39, 4, 3,
				6, 9, 10, 3, 4, 1, 6, 9, 0 };
		int backpackCapacity = 100;

		setWeights(weights);
		setValues(values);
		setBackpackCapacity(backpackCapacity);
	}

	/**
	 * 
	 */
	private static void testPerformanceConsumptionDynamicProgramming() {
		long initFreeMemory, totalMemory;
		long startTime, endTime;
		startTime = System.nanoTime();

		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		initFreeMemory = (long) runtime.freeMemory();
		totalMemory = (long) runtime.totalMemory();

		setUp(); // initilaize to default values.
		Knapsack backpack = new Knapsack(weights, values, backpackCapacity);
		DecimalFormat decimalFormat = new DecimalFormat("#,###");

		// ////////////////////////////// Process
		int recursiveValue = backpack.getDynamicOptimalValue();
		// ////////////////////////////// Process
		endTime = System.nanoTime();
		long afterProcessMemory = (long) runtime.freeMemory();
		String title = "backpack.getDynamicOptimalValue()";

		printPerformanceTable(initFreeMemory, totalMemory, startTime, endTime,
				decimalFormat, recursiveValue, afterProcessMemory, title);

		System.out
				.println("=======> end: testPerformanceConsumptionDynamicProgramming()\n");
	}

	/**
	 * 
	 */
	private static void testPerformanceConsumptionRecursiveProgramming() {
		long initFreeMemory, totalMemory;
		long startTime, endTime;
		startTime = System.nanoTime();

		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		initFreeMemory = (long) runtime.freeMemory();
		totalMemory = (long) runtime.totalMemory();

		setUp();
		Knapsack backpack = new Knapsack(weights, values, backpackCapacity);
		DecimalFormat decimalFormat = new DecimalFormat("#,###");

		// ////////////////////////////// Process
		int recursiveValue = backpack.getRecursiveOptimalValue();
		// ////////////////////////////// Process
		endTime = System.nanoTime();
		long afterProcessMemory = (long) runtime.freeMemory();
		String title = "backpack.getRecursiveOptimalValue()";

		printPerformanceTable(initFreeMemory, totalMemory, startTime, endTime,
				decimalFormat, recursiveValue, afterProcessMemory, title);

		System.out
				.println("=======> end: testPerformanceConsumptionRecursiveProgramming()\n");

	}

	/**
	 * @param initFreeMemory
	 * @param totalMemory
	 * @param startTime
	 * @param endTime
	 * @param decimalFormat
	 * @param recursiveValue
	 * @param afterProcessMemory
	 * @param title
	 */
	private static void printPerformanceTable(long initFreeMemory,
			long totalMemory, long startTime, long endTime,
			DecimalFormat decimalFormat, int recursiveValue,
			long afterProcessMemory, String title) {
		System.out
				.printf(
						"| %-86s%10d |\n%s",
						"Performance Consumption Table - Process:" + title,
						recursiveValue,
						"====================================================================================================\n");

		System.out.printf("| %-50s | %20s | %20s | \n", "Initial Free memory",
				decimalFormat.format(initFreeMemory) + " Bytes",
				bytesToMegabytes(initFreeMemory) + " MBytes");
		System.out.printf("| %-50s | %20s | %20s | \n", "Total memory",
				decimalFormat.format(totalMemory) + " Bytes",
				bytesToMegabytes(totalMemory) + " MBytes");
		System.out.printf("| %-50s | %20s | %20s | \n", "Initial Program usage",
				decimalFormat.format(totalMemory - initFreeMemory) + " Bytes",
				bytesToMegabytes(totalMemory - initFreeMemory) + " MBytes");

		System.out.printf("| %-50s | %20s | %20s | \n", "Free Memory",
				decimalFormat.format(afterProcessMemory) + " Bytes",
				bytesToMegabytes(afterProcessMemory) + " MBytes");
		System.out.printf("| %-50s | %20s | %20s | \n", "Program Usage",
				decimalFormat.format(totalMemory - afterProcessMemory) + " Bytes",
				bytesToMegabytes(totalMemory - afterProcessMemory) + " MBytes");
		System.out.printf(
				"| %-50s | %20s | %20s | \n",
				"Program Execution Time",
				TimeUnit.MILLISECONDS.convert((endTime - startTime),
						TimeUnit.NANOSECONDS) + " milliseconds",
				TimeUnit.SECONDS.convert((endTime - startTime),
						TimeUnit.NANOSECONDS) + " seconds");

		System.out
				.println("====================================================================================================\n");
	}

	/**
	 * 
	 */
	private static void testSameOptimvalValueForDynamicVSRecursive() {
		int[] weights1 =
		{ 1, 2, 3 };
		int[] values1 =
		{ 1, 1, 1 };
		int backpackCapacity1 = 5;

		int[] weights2 =
		{ 5, 2, 3, 7 };
		int[] values2 =
		{ 1, 1, 1, 7 };
		int backpackCapacity2 = 10;

		int[] weights3 =
		{ 1, 2, 3, 7, 3 };
		int[] values3 =
		{ 1, 1, 1, 7, 3 };
		int backpackCapacity3 = 7;

		int[] weights4 =
		{ 10, 3, 4, 1, 6, 9, 0, 3, 4, 3, 6, 9, 10, 13, 9, 3, 6, 9, 10, 3, 4, 31,
				6, 9 };
		int[] values4 =
		{ 2, 3, 4, 5, 10, 5, 10, 3, 4, 3, 6, 9, 10, 3, 4, 3, 6, 9, 10, 39, 4, 3,
				6, 9 };
		int backpackCapacity4 = 100;

		Knapsack backpack1 = new Knapsack(weights1, values1, backpackCapacity1);
		Knapsack backpack2 = new Knapsack(weights2, values2, backpackCapacity2);
		Knapsack backpack3 = new Knapsack(weights3, values3, backpackCapacity3);
		Knapsack backpack4 = new Knapsack(weights4, values4, backpackCapacity4);

		System.out.println("getRecursiveOptimalBackpack: "
				+ backpack1.getRecursiveOptimalValue());
		System.out.println("getDynamicProgramming: "
				+ backpack1.getDynamicOptimalValue());

		System.out.println("getRecursiveOptimalBackpack: "
				+ backpack2.getRecursiveOptimalValue());
		System.out.println("getDynamicProgramming: "
				+ backpack2.getDynamicOptimalValue());

		System.out.println("getRecursiveOptimalBackpack: "
				+ backpack3.getRecursiveOptimalValue());
		System.out.println("getDynamicProgramming: "
				+ backpack3.getDynamicOptimalValue());

		System.out.println("getRecursiveOptimalBackpack: "
				+ backpack4.getRecursiveOptimalValue());
		System.out.println("getDynamicProgramming: "
				+ backpack4.getDynamicOptimalValue());
		System.out
				.println("=======> end: testSameOptimvalValueForDynamicVSRecursive()\n");
	}

	public static long bytesToMegabytes(long bytes) {
		return bytes / MEGABYTE;
	}

	/**
	 * @param weights
	 *           the weights to set
	 */
	public static void setWeights(int[] weights) {
		TestBackpackPerformance.weights = weights;
	}

	/**
	 * @param values
	 *           the values to set
	 */
	public static void setValues(int[] values) {
		TestBackpackPerformance.values = values;
	}

	/**
	 * @param backpackCapacity
	 *           the backpackCapacity to set
	 */
	public static void setBackpackCapacity(int backpackCapacity) {
		TestBackpackPerformance.backpackCapacity = backpackCapacity;
	}
}
