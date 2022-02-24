
public class Pro11 {

	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	public static int maxArea(int[] height) {
		int i = 0, j = height.length - 1, result = 0, temp = 0;
		if (height.length < 2) {
			return result;
		}
		while (i + 1 <= j) {
			temp = min(height[i], height[j]) * (j - i);
			if (temp > result) {
				result = temp;
			}
			if (height[i] > height[j]) {
				j--;
				continue;
			} else {
				i++;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 5, 25, 24, 5 };
		System.out.println(maxArea(nums));

	}

}
