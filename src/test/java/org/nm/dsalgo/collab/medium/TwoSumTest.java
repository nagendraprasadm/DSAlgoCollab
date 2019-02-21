package org.nm.dsalgo.collab.medium;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.BeforeClass;
import org.junit.Test;

public class TwoSumTest {

	private static TwoSum inst;

	@BeforeClass
	public static void setupBeforeClass() {
		inst = new TwoSum();
	}

	@Test
	public void testOne() {
		int[] result = inst.twoSum(new int[] { 2, 8, 7 }, 9);
		int[] expected = new int[] { 0, 2 };
		assertTrue(Objects.deepEquals(result, expected));
	}

	@Test
	public void testTwo() {
		int[] result = inst.twoSum(new int[] { 3,2,4 }, 6);
		int[] expected = new int[] { 1, 2 };
		assertTrue(Objects.deepEquals(result, expected));
	}
}
