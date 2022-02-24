
public class Pro941 {

	public static boolean validMountainArray(int[] A) {
		int flag = 0;
		if (A.length < 3) {
			return false;
		}
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] < A[i + 1] && flag == 0) {
				continue;
			} else if (A[i] < A[i + 1] && flag == 1) {
				return false;
			} else if (A[i] == A[i + 1]) {
				return false;
			} else if (i > 0 && A[i] > A[i + 1]) {
				flag = 1;
			} else if (i == 0 && A[i] > A[i + 1]) {
				return false;
			} else {
				continue;
			}
		}
		if (flag == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(validMountainArray(nums));
	}

}
