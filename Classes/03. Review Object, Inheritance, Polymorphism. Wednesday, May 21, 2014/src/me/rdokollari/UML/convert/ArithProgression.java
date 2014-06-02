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
public class ArithProgression extends Progression {
	private long inc;

	public ArithProgression() {
		this(1);
	}

	public ArithProgression(long inc) {
		setInc(inc);
	}

	@Override
	public long nextValue() {
		setCur(getCur() + getInc());
		return getCur();
	}

	/**
	 * @return the inc
	 */
	public long getInc() {
		return inc;
	}

	/**
	 * @param inc
	 *            the inc to set
	 */
	public void setInc(long inc) {
		this.inc = inc;
	}

}
