
public class Leetcode34 {

	public static int[] searchRange(int[] nums, int target) {
		int a = -1, b = nums.length;

		int mid = nums.length - 1 / 2;
		if (nums[mid] == target) {
			a = mid;
			b = mid;

		}

	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int t = 8;
		System.out.println(searchRange(nums, t));

	}

}
