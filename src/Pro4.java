
public class Pro4 {
	public static boolean findNumberIn2DArray(int[][] matrix, int target) {
		int j = 0, i = matrix.length - 1;
		while (i >= 0 && j <= matrix[0].length - 1) {
			System.out.println(matrix[i][j]);
			if (matrix[i][j] > target) {
				i--;
			} else if (matrix[i][j] < target) {
				j++;
			} else {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };

		System.out.println(findNumberIn2DArray(arr1, 20));
	}

}
