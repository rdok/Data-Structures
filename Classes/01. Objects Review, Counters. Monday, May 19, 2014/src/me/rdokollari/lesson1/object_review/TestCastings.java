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
package me.rdokollari.lesson1.object_review;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 19, 2014
 */
public class TestCastings {

	public static void main(String[] args) {
		double d1 = 3.2;
		double d2 = 3.9999;
		// casting gets rid of what ever it's after the '.'
		int i1 = (int) d1;
		int i2 = (int) d2;

		int i3 = 10;
		int i4 = 3;
		// either of one if casted to double will print double
		System.out.println((double) i3 / i4);
	}
}
