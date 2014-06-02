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
package me.rdokollari.exceptions;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 22, 2014
 */
public class TestStudent {

	/**
	 * 
	 */
	private static void test_StudentConstructor() {

		try {
			Student student0 = new Student("R");
			Student student1 = new Student("R b");

			System.out.println(student0);
			System.out.println(student1);
		} catch (FullNameException fNE) {
			System.out.println("Error: " + fNE.getMessage());
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test_StudentConstructor();
	}

}
