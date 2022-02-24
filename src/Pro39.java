import java.util.HashMap;
import java.util.Map;

public class Pro39 {

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				return nums[i];
			}
		}
		return nums[0];
	}

	public static void main(String[] args) {
		int[] nums = { 3,1,2,3};
		System.out.println(majorityElement(nums));
	}

}
