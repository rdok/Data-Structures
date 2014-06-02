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

import java.util.ArrayList;

import me.rdokollari.interfaces.Photograph;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 22, 2014
 */
public class TestPhotograph {

	public static void main(String[] args) {
		ArrayList<Product> shoppingCart = new ArrayList<Product>();
		Photograph p1 = new Photograph("description1", 10, true, "artistName1");
		Photograph p2 = new Photograph("description2", 20, false, "artistName2");
		Photograph p4 = new Photograph("description3", 30, true, "artistName3");
		Photograph p5 = new Photograph("description4", 40, false, "artistName4");
		Photograph p6 = new Photograph("description5", 50, true, "artistName5");
		BoxedItem b1 = new BoxedItem("productName", 18.00, 1000, 100, 100, 150, true);
		BoxedItem b2 = new BoxedItem("productName1", 20.00, 1500, 150, 200, 450, true);

		shoppingCart.add(p1);
		shoppingCart.add(p2);
		shoppingCart.add(b2);

		printShoppingCart(shoppingCart); // description, lowest price
	}

	/**
	 * @param shoppingCart
	 * 
	 */
	private static void printShoppingCart(ArrayList<Product> shoppingCart) {

		for (Product i : shoppingCart) {
			System.out.println(i.getClass());
			if (i instanceof Photograph) {
				System.out.println("Description"
						+ ((Photograph) i).getProductName()
						+ ", Lowest Price: "
						+ ((Photograph) i).getLowestPrice());
			} else if (i instanceof BoxedItem) {
				System.out.println("Description" + ((BoxedItem) i).getProductName()
						+ ", Lowest Price: " + ((BoxedItem) i).getLowestPrice());
			}

		}
	}
}
