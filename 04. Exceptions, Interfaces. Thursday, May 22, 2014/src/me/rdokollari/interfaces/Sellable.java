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
 * An interface is a collection of method declarations with no data and no
 * bodies. When a class implements an interface, it must implement all of the
 * methods declared in the interface.
 * 
 * Interface for objects that can be sold. * / *
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 22, 2014
 */
public interface Sellable {

	public String getDescription();

	/* list price in cents */
	public int getPrice();

	/** lowest price in cents we will accept */
	public double getLowestPrice();

}
