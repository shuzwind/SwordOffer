
public class Leetcode724 {

	public static int pivotIndex(int[] nums) {
		int len = nums.length;
		if (len < 1) {
			return -1;
		}
		int[] left = new int[len];
		int[] right = new int[len];
		left[0] = 0;
		right[len - 1] = 0;
		for (int i = 1; i < len; i++) {
			left[i] = left[i - 1] + nums[i - 1];
		}
		for (int i = len - 2; i >= 0; i--) {
			right[i] = right[i + 1] + nums[i + 1];
		}
		for (int i = 0; i < len; i++) {
			if (left[i] == right[i]) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 0, 0, 1 };
		System.out.println(pivotIndex(nums));

	}

}
