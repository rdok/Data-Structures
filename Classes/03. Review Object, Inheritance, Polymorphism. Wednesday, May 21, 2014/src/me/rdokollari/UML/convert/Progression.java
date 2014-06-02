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
public class Progression {
	private long first;
	private long cur;

	/**
	 * reset progression.
	 */
	public Progression() {
		setFirst(0);
		setCur(0);
	}

	/**
	 * reset cur to initial value and then return it.
	 * 
	 * @return
	 */
	public long firstValue() {
		cur = first;
		return first;
	}

	public long nextValue() {
		return ++cur;
	}

	/**
	 * do the progression and print it. it should reset it self (firstValue).
	 * then loop until 5, print them, advance your progression. print first
	 * value. (firvalue, print);
	 * 
	 * @param progress
	 */
	public void printProgression(int progress) {
		System.out.println(firstValue());

		// should start from 1 since it already printed it once.
		for (int i = 1; i < progress; i++) {
			System.out.println(nextValue());
		}
	}

	/**
	 * @return the first
	 */
	public long getFirst() {
		return first;
	}

	/**
	 * @param first
	 *            the first to set
	 */
	public void setFirst(long first) {
		this.first = first;
	}

	/**
	 * @return the cur
	 */
	public long getCur() {
		return cur;
	}

	/**
	 * @param cur
	 *            the cur to set
	 */
	public void setCur(long cur) {
		this.cur = cur;
	}

}
