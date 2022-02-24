public class Leetcode1221 {

	public static int balancedStringSplit(String s) {
		int count = 0;
		int curL = 0, curR = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ('L')) {
				curL++;
			}
			if (c == ('R')) {
				curR++;
			}
			if (curL > 0 && curL == curR) {
				curL = 0;
				curR = 0;
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(balancedStringSplit("LLLRRR"));

	}

}
