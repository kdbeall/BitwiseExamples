package edu.ncsu.bitwise;

/**
 * This class shows examples of bitwise operations in Java
 * 
 * @author Keng-Hui Beall
 *
 */
public class BitWise {

	/**
	 * Performs a unary bitwise complement
	 * Recall, Java represents integers with two's complement
	 * @param value
	 *            the value we want to complement
	 * @return the value's complement
	 */
	public static int negate(int value) {
		return ~value;
	}

	/**
	 * Shifts the value left by k This is also called a left arithmetic shift
	 * Zeros are shifted in on the right; note that a left arithmetic shift
	 * is the same as a left logical shift
	 * @param value
	 *            the value to left shift by k
	 * @param k
	 *            how many places to shift
	 * @return the value left arithmetic shifted by k places
	 */
	public static int signedLeftShift(int value, int k) {
		return value << k;
	}

	/**
	 * Shifts the value right by k. This is also called a right arithmetic shift
	 * The sign (the value of the most significant bit) is shifted in on the
	 * left This preserves the sign of the operand
	 * 
	 * @param value
	 *            the value to right shift by k
	 * @param k
	 *            how many places to shift
	 * @return the value right arithmetic shifted by k places
	 */
	public static int signedRightShift(int value, int k) {
		return value >> k;
	}

	/**
	 * Shifts the value logically right by k. This is called a logical shift right
	 * Zeros are filled in on the left. The sign bit is not preserved 
	 * @param value
	 * @param k
	 * @return the logical shift right
	 */
	public static int unsignedRightShift(int value, int k) {
		return value >>> k;
	}

}
