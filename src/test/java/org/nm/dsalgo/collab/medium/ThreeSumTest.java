package org.nm.dsalgo.collab.medium;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreeSumTest {
	private static final Logger logger = LoggerFactory.getLogger(ThreeSumTest.class);
	private static ThreeSum inst;

	@Rule
	public TestName testName = new TestName();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inst = new ThreeSum();
	}

	@Test
	public void testOne() {

		int nums[] = new int[] { 1, 0, -1 };
		List<List<Integer>> result = inst.threeSum(nums, 0);
		assertTrue(result != null && result.size() > 0);
	}

	@Test
	public void testTwo() {

		int nums[] = new int[] { 1 };
		List<List<Integer>> result = inst.threeSum(nums, 0);
		assertTrue(result != null && result.size() == 0);
	}

	@Test
	public void testThree() {

		int nums[] = new int[] { 1, 0, -1, 0, -1 };
		List<List<Integer>> result = inst.threeSum(nums, 0);
		logger.debug("[{}] - Result Found - [{}]", testName.getMethodName(), result);
		assertTrue(result != null && result.size() > 0);
	}
	
	@Test
	public void testFour() {

		int nums[] = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = inst.threeSum(nums, 0);
		logger.debug("[{}] - Result Found - [{}]", testName.getMethodName(), result);
		assertTrue(result != null && result.size() > 0);
	}
	
	@Test
	public void testFive() {

		int nums[] = new int[] { };
		List<List<Integer>> result = inst.threeSum(nums, 0);
		logger.debug("[{}] - Result Found - [{}]", testName.getMethodName(), result);
		assertTrue(result == null || result.size() == 0);
	}
	
	@Test
	public void testSix() {

		int nums[] = new int[] { 1 };
		List<List<Integer>> result = inst.threeSum(nums, 0);
		logger.debug("[{}] - Result Found - [{}]", testName.getMethodName(), result);
		assertTrue(result == null || result.size() == 0);
	}
	
	@Test
	public void testSeven() {

		int nums[] = new int[] { 1, -1 };
		List<List<Integer>> result = inst.threeSum(nums, 0);
		logger.debug("[{}] - Result Found - [{}]", testName.getMethodName(), result);
		assertTrue(result == null || result.size() == 0);
	}
	
	@Test
	public void testEight() {

		int nums[] = new int[] { 1, -1 , 0};
		List<List<Integer>> result = inst.threeSum(nums, 20);
		logger.debug("[{}] - Result Found - [{}]", testName.getMethodName(), result);
		assertTrue(result == null || result.size() == 0);
	}
	
	@Test
	public void testNine() {

		int nums[] = new int[] { 2, 8, 6, 9, 12, 3, 10, 7, 2};
		List<List<Integer>> result = inst.threeSum(nums, 20);
		logger.debug("[{}] - Result Found - [{}]", testName.getMethodName(), result);
		assertTrue(result != null && result.size() > 0);
	}
}
