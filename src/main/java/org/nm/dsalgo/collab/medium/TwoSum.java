package org.nm.dsalgo.collab.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * @author Nagendra
 *
 */

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			numsMap.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (numsMap.containsKey(target - nums[i]) && numsMap.get(target - nums[i]) > i) {
				return new int[] { i, numsMap.get(target - nums[i]) };
			}
		}
		return new int[] {};
	}
}
