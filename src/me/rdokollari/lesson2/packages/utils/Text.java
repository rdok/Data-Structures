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
package me.rdokollari.lesson2.packages.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * TODO: TRIM TO SPACE
 * 
 * @author Rizart Dokollari @ rdokollari.me
 * @since May 20, 2014
 */
public class Text {

	private static Scanner input = new Scanner(System.in);

	public static boolean isAplhabetic(String input) {
		return (Pattern.matches("[a-zA-Z]+", input));
	}

	public static boolean isAplhanumeric(String input) {
		return (Pattern.matches("\\w+", input));
	}

	public static Integer readInt(String message, String errorMessage) {
		Integer tempInput = null;
		boolean correct = false;
		String x;
		input.useDelimiter(System.getProperty("line.separator"));
		do {
			System.out.println(message);
			x = input.nextLine();
			if (!x.isEmpty()) {
				if (isInteger(x)) {
					correct = true;
					tempInput = Integer.parseInt(x);
				} else {
					System.out.println(errorMessage);
					correct = false;
				}
			} else {
				correct = true;
			}
		} while (!correct);
		return tempInput;

	}
}
