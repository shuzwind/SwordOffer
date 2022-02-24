public class swoffer61 {
	public static boolean isStraight(int[] nums) {
		int min = 14, max = -1, numKing = 0;
		int len = nums.length;
		boolean[] result = new boolean[13];
		for (int i = 0; i < len; i++) {
			int num = nums[i];
			if (num == 0) {
				numKing++;
			} else if (result[num] == true) {
				return false;
			} else {
				result[num] = true;
				min = (num < min ? num : min);
				max = (num > max ? num : max);
			}
		}
		for (int i = min; i <= max; i++) {
			if (result[i] == false) {
				if (numKing > 0) {
					numKing--;
					System.out.println(numKing);
				} else {
					return false;
				}
			}

		}
		return true;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 8, 5, 4 };
		System.out.println(isStraight(nums));
	}

}
