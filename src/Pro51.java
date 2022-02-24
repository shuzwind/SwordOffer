
public class Pro51 {

	public static int[][] insert(int[][] intervals, int[] newInterval) {
		int leftIn = -1, rightIn = -1, leftOut = -1, rightOut = -1;
		int left = newInterval[0], right = newInterval[1];
		int[][] result = new int[10][10];
		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i][0] <= left && intervals[i][1] >= left) {
				leftIn = i;
			}
			if (intervals[i][0] <= right && intervals[i][1] >= right) {
				rightIn = i;
			}
			if (i < intervals.length - 1 && intervals[i][1] < left && intervals[i + 1][0] > left) {
				leftOut = i;
			}
			if (i < intervals.length - 1 && intervals[i][1] <= right && intervals[i + 1][0] >= right) {
				rightOut = i;
			}
			for(int i=0;i<)

		}

	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 2 }, { 6, 9 } };
		int[] newInterval = { 2, 5 };
		System.out.println(insert(intervals, newInterval));
	}

}
