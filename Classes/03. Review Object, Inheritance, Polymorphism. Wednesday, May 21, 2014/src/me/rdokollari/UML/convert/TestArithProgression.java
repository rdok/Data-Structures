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
package me.rdokollari.UML.convert;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 21, 2014
 */
public class TestArithProgression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test_printProgressionWithDefaultConstructor();
		test_printProgressionWithArgumentsConstructor();
	}

	/**
	 * 
	 */
	private static void test_printProgressionWithDefaultConstructor() {
		ArithProgression arithProgressin = new ArithProgression();
		arithProgressin.printProgression(5);
		System.out
				.println("end: testPrintArithProgressionWithDefaultConstructor()\n===\n");
	}

	/**
	 * 
	 */
	private static void test_printProgressionWithArgumentsConstructor() {
		ArithProgression arithProgressin = new ArithProgression(2);
		arithProgressin.printProgression(10);
		System.out
				.println("end: testPrintArithProgressionWithArgumentsConstructor()\n===\n");
	}
}
