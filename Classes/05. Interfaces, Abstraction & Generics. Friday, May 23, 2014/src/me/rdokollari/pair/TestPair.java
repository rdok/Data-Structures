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
package me.rdokollari.pair;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 23, 2014
 */
public class TestPair {
	public static void main(String[] args) {
		Pair<Integer, String> pair = new Pair<Integer, String>(10, "string");
		//pair.set(10, "string");

		System.out.println(pair);
	}
}
