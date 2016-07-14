package edu.ncsu.bitwise;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Shows our Bit wise operations in action
 * 
 * @author Keng-Hui Beall
 *
 */
public class BitWiseTest {
	/**
	 * Some constants to play around with
	 */
	private final int one = 1;
	private final int zero = 0;
	private final int negativeOne = -1;

	/**
	 * Tests our negate operation
	 */
	@Test
	public void testNegate() {
		assertEquals(BitWise.negate(negativeOne), 0);
	}

	/**
	 * Tests our signed shift left (same as unsigned shift left)
	 */
	@Test
	public void testSignedShiftLeft() {
		assertEquals(BitWise.signedLeftShift(one, 1), 0x002);

	}

	/**
	 * Tests our signed shift right. We shift bits right with MSB preserved
	 */
	@Test
	public void testSignedShiftRight() {
		assertEquals(BitWise.signedRightShift(negativeOne, 1), -1);
		assertEquals(BitWise.signedRightShift(one, 1), 0);
	}

	/**
	 * Tests our unsigned shift right We shift bits right with a zero filled in
	 * at the MSB
	 */
	@Test
	public void testUnsignedShiftRight() {
		assertEquals(BitWise.unsignedRightShift(negativeOne, 1), 2147483647);
	}

}
