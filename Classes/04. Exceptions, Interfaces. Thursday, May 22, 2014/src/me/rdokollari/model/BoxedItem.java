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
package me.rdokollari.model;

import me.rdokollari.interfaces.Insurableltem;
import me.rdokollari.interfaces.Sellable;
import me.rdokollari.interfaces.Transportable;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 22, 2014
 */
public class BoxedItem implements Insurableltem {

	private String description;
	private int price;
	private int weight; // in grams
	private boolean isHazardous;
	private int height = 0; // box height in centimeters
	private int width = 0; // box width in centimeters
	private int depth = 0; // box depth in centimeters

	/**
	 * @param productName
	 * @param price
	 */
	public BoxedItem(String description, int price, int weight,
			boolean isHazaroudous) {
		setDescription(description);
		setPrice(price);
		setWeight(weight);
		setHazaroudous(isHazaroudous);
	}

	public void setBox(int weight, int width, int depth) {
		setWeight(weight);
		setWidth(width);
		setDepth(depth);
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @param isHazaroudous
	 *            the isHazaroudous to set
	 */
	public void setHazaroudous(boolean isHazaroudous) {
		this.isHazardous = isHazaroudous;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see me.rdokollari.interfaces.Transportable#isHazardous()
	 */
	public boolean isHazardous() {
		return isHazardous;
	}

	public int getInsuredValue() {
		return getPrice() * 2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see me.rdokollari.interfaces.Sellable#getLowestPrice()
	 */
	public double getLowestPrice() {
		return getPrice() / 2;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @param depth
	 *            the depth to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

}
