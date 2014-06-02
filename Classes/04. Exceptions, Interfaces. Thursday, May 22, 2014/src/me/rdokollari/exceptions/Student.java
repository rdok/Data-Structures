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
package me.rdokollari.exceptions;

/**
 * You should never re-validate this code. YOu should have it as a library and
 * reuse it in another program without having to change it's code. Your goal
 * should be to have it as an API, where you have access only to the interface,
 * and the source code is hidden.
 * 
 * You should test every case scenario of your code.
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 22, 2014
 */
public class Student {
	private String fullName;
	private int id;
	static int idCounter;

	/**
	 * 
	 * @param fullName
	 * @throws FullNameException
	 */
	public Student(String fullName) throws FullNameException {
		setFullName(fullName);
		setId(idCounter); // first increments idCounter, then sets it
	}

	private void incrementIdCounter() {
		idCounter++;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 * @throws ΕmptyFullNameException
	 */
	public void setFullName(String fullName) throws FullNameException {
		if (fullName.isEmpty()) {
			throw new FullNameException("Full name cannot be empty");
		}

		if (fullName.length() < 3) {
			throw new FullNameException(
					"Full name must be 3 length min (including empty)");
		}

		this.fullName = fullName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		incrementIdCounter();
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", id=" + id + "]";
	}

}
