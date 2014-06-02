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

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.carrotsearch.junitbenchmarks.annotation.AxisRange;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkMethodChart;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since Jun 1, 2014
 */
@AxisRange(min = 0, max = 1)
@BenchmarkMethodChart(filePrefix = "benchmark-lists")
public class TestBackpack
{
	@Rule
	public TestRule benchmarkRun = new BenchmarkRule();
	private Knapsack backpack;
	private int OPTIMAL_VALUE = 153;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		int[] weights =
		{ 10, 3, 4, 1, 6, 9, 0, 3, 4, 3, 6, 9, 10, 13, 9, 3, 6, 9, 10, 3, 4, 31,
				6, 9 };
		int[] values =
		{ 2, 3, 4, 5, 10, 5, 10, 3, 4, 3, 6, 9, 10, 3, 4, 3, 6, 9, 10, 39, 4, 3,
				6, 9 };
		int backpackCapacity = 100;

		backpack = new Knapsack(weights, values, backpackCapacity);
	}

	@Test
	public void test_getRecursiveOptimalValue() throws InterruptedException {
		assertEquals(backpack.getRecursiveOptimalValue(), OPTIMAL_VALUE, 0);
	}

	@Test
	public void tes_getDynamicKnapsackValue() throws InterruptedException {
		assertEquals(backpack.getDynamicOptimalValue(), OPTIMAL_VALUE, 0);
	}
	
	
}
