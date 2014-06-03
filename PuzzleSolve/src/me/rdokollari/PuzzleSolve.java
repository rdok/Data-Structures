/*******************************************************************************
 * The MIT License (MIT)
 * 
 * Copyright (c) 2014 Rizart Dokollari
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package me.rdokollari;

import java.util.ArrayList;

/**
 * @author Rizart Dokollari @ rdokollari.me
 * @since Jun 3, 2014
 */
public class PuzzleSolve
{

	public String puzzlSolve(int k, String sequence, ArrayList<Character> set,
			String solution) {

		for (int i = 0; i < set.size(); i++) {

			char currElem = set.get(i);
			set.remove(i);
			sequence += Character.toString(currElem);

			if (k == 1) {
				if (sequence.equals(solution)) {
					return sequence;
				} // end inner if
			} else {
				sequence = puzzlSolve(k - 1, sequence, set, solution);
			}

			
			if (!sequence.equals(solution)) {
				set.add(i, currElem);
				sequence = sequence.substring(0, sequence.length() - 1);
			}
		} // end outer for

		return sequence;
	}
}
