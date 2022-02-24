
public class Leetcode547 {

	public static int findCircleNum(int[][] isConnected) {
		int cityNum = isConnected.length;
		int index = 1;
		int repeatCount = 0;
		int[] indexRecord = new int[cityNum];
		for (int i = 0; i < cityNum; i++) {
			for (int j = 0; j < cityNum; j++) {
				if (isConnected[i][j] == 1) {
					if (indexRecord[j] > 0 && indexRecord[i] > 0) {
						if (indexRecord[j] != indexRecord[i]) {
							indexRecord[j] = indexRecord[i];
							for (int k = 0; k < cityNum; k++) {
								if (isConnected[j][k] == 1) {
									indexRecord[k] = indexRecord[i];
								}
							}
							repeatCount++;
						} else {
							continue;
						}
					} else if (indexRecord[i] > 0) {
						indexRecord[j] = indexRecord[i];
					} else if (indexRecord[j] > 0) {
						indexRecord[i] = indexRecord[j];
					} else {
						indexRecord[i] = index;
						indexRecord[j] = index;
						index++;
					}

				}

			}
		}
		System.out.println("index" + index);
		System.out.println("repeatCount" + repeatCount);
		for (int i = 0; i < indexRecord.length; i++) {
			System.out.println(indexRecord[i]);

		}
		return index - 1 - repeatCount;

	}

	public static void main(String[] args) {

		int[][] cities = { { 1, 0, 0, 1 }, { 0, 1, 1, 0 }, { 0, 1, 1, 1 }, { 1, 0, 1, 1 } };
		System.out.println(findCircleNum(cities));

	}

}
