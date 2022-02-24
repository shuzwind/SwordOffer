/**
 * 有序数组插入
 * 
 * @author shuzhuo
 *
 */
public class Leetcode35 {

	public int searchInsert(int[] nums, int target) {

		int begin = 0;
		int end = nums.length - 1;
		int middle = (begin + end) / 2;

		while (begin < end) {
			middle = (begin + end) / 2;
			int cur = nums[middle];
			if (cur == target) {
				return middle;
			} else if (cur < target) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		int res = nums[begin];
		if (res >= target) {
			return begin;
		} else {
			return begin + 1;
		}

	}

}
