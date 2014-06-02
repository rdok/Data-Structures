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
 * up to page 75.
 * java advaced features. 
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 21, 2014
 */
public class GeomProgression extends Progression {
	private long base;

	/**
	 * first value of base should be one.
	 */
	public GeomProgression() {
		this(2);
		setFirst(1);
		// setCur(1);
	}

	public GeomProgression(long base) {
		setBase(base);
		setFirst(1);
	}

	@Override
	public long nextValue() {
		setCur(getBase() * getCur());
		return getCur();

	}

	/**
	 * @return the base
	 */
	public long getBase() {
		return base;
	}

	/**
	 * @param base
	 *            the base to set
	 */
	public void setBase(long base) {
		this.base = base;
	}

}
