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
package me.rdokollari.interfaces;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 22, 2014
 */
public class Photograph implements Sellable {

	private String description;
	private boolean color;
	private int price;

	/**
	 * 
	 * @param description
	 * @param price
	 * @param color
	 */
	public Photograph(String description, int price, boolean color) {
		setDescription(description);
		setPrice(price);
		setColor(color);
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
	 * @return the color
	 */
	public boolean isColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(boolean color) {
		this.color = color;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Photograph [description=" + description + ", color=" + color
				+ ", price=" + price + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see me.rdokollari.interfaces.Sellable#getListPrice()
	 */
	public double getListPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see me.rdokollari.interfaces.Sellable#getLowestPrice()
	 */
	public double getLowestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
