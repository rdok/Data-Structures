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
 * WARNING: you need to know definitions; question will be using those
 * definition.
 * 
 * Can we use Counter.getTotalCounter()
 * 
 * Java docs describe code in class:
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 19, 2014
 */
public class Counter {
	// instance variable -- every instance of the counter will have a different
	// counter
	private int count;
	// class instance -- all variables will be same
	// static variables cannot be accessed if set to private
	private static int totalCounter;

	/**
	 * default constructor -- no arguments.
	 */
	public Counter() {
		setCount(0);
		incrementCounter();
	}

	/**
	 * parameter list
	 * 
	 * @param counter
	 */
	public Counter(int counter) {
		setCount(counter);
		incrementCounter();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Counter [getCount()=" + getCount() + "]";
	}

	/**
	 * assessor
	 * 
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * SOS: mutator
	 * 
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * SOS: mutator
	 * 
	 * @param count
	 *            the count to set
	 */
	public static void incrementCounter() {
		totalCounter++;
	}

	/**
	 * SOS: assessor
	 * 
	 * @return the totalCounter
	 */
	public static int getTotalCounter() {
		return totalCounter;
	}

	/**
	 * @param totalCounter
	 *            the totalCounter to set
	 */
	public static void setTotalCounter(int totalCounter) {
		Counter.totalCounter = totalCounter;
	}

}
