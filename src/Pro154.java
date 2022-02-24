public class Pro154 {
	public static int findMin(int[] nums) {
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				result = nums[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int nums[] = {2,2,2,0,1};
		System.out.println(findMin(nums));

	}

}
