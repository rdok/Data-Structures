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

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 31, 2014
 */
public class Item
{
	static DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
	private String name;
	private int value; // euro
	private int weight; // kg

	public Item(String name, int value, int weight) throws Exception {
		setName(name);
		setValue(value);
		setWeight(weight);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *           the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *           the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *           the weight to set
	 * @throws Exception
	 */
	public void setWeight(int weight) throws Exception {
		if (weight < 0) {
			throw new Exception("Weight must be positive.");
		}
		this.weight = weight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%-32s|%20s |%20d |", getName(),
				decimalFormat.format(getValue()), getWeight());
	}
}
