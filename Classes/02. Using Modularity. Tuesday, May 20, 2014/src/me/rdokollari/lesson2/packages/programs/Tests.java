package me.rdokollari.lesson2.packages.programs;

import me.rdokollari.lesson2.packages.utils.Numeric;

public class Tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(Numeric.isInteger("a43"));
		System.out.println(Numeric.isInteger("43"));
		System.out
				.println(Numeric.isInteger("5434543543534576587687434523443"));
		System.out.println(Numeric.isNumeric("5424324"));
		System.out.println(Numeric.isNumeric("ds5424324"));
		System.out.println(Numeric.isNumeric(" 76"));

		System.out.println(Numeric.readInt("DOSE NOUMERO:",
				"DEN EINAI NOUMERO!"));
	}

}
