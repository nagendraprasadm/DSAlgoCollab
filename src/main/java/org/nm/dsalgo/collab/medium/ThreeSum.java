package org.nm.dsalgo.collab.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the sum
 * of zero.
 * 
 * Note:
 * 
 * The solution set must not contain duplicate triplets.
 * 
 * Example:
 * 
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 * 
 * @author Nagendra
 *
 */
public class ThreeSum {

	/*-
	 * - Sort the Elements.
	 * - Loop through the sorted array
	 * 
	 * 		- Make the target as Target - Current Element (i)
	 * 		- 2 Sum for the current target
	 * 			- Loop through from Next Element (j)
	 * 				- Check if I and J combination is already there.
	 * 				- Else 
	 *                  - Create a map
	 * 					- Last Target is Current Target - Jth Item
	 * 					- If Last Target is in map result is value of the map
	 * 					- ELSE add Current Target - jth into the map
	 * 
	 */
	public List<List<Integer>> threeSum(int[] nums, int target) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums != null && nums.length > 2) {
			Arrays.sort(nums);
			Map<Integer, List<Integer>> processedMap = new HashMap<Integer, List<Integer>>();
			for (int i = 0; i < nums.length; i++) {

				int curTarget = target - nums[i];
				if (i + 1 < nums.length) {
					// 2 Sum for Current Target Starting from i + 1
					Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
					for (int j = i + 1; j < nums.length; j++) {
						int lastTarget = curTarget - nums[j];

						List<Integer> secondElements = processedMap.get(nums[i]);

						if (secondElements != null && secondElements.contains(lastTarget)) {
							continue;
						}

						if (numsMap.containsKey(lastTarget)) {
							List<Integer> curMatch = new ArrayList<Integer>();
							curMatch.add(nums[i]);
							curMatch.add(lastTarget);
							curMatch.add(nums[j]);
							result.add(curMatch);

							secondElements = processedMap.get(nums[i]);

							if (secondElements == null) {
								secondElements = new ArrayList<Integer>();
							}
							secondElements.add(lastTarget);
							processedMap.put(nums[i], secondElements);

						} else {
							numsMap.put(nums[j], j);
						}
					}
				}
			}
		}
		return result;
	}

}
