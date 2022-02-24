import java.util.HashMap;
import java.util.Map;

public class Leetcode13 {
	public static int romanToInt(String s) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", 4);
		map.put("IX", 9);
		map.put("XL", 40);
		map.put("XC", 90);
		map.put("CD", 400);
		map.put("CM", 900);

		int res = 0;
		for (int i = 0; i < s.length();) {
			if (i + 1 < s.length() && map.get(s.substring(i + 1, i + 2)) > map.get(s.substring(i, i + 1))) {
				res += map.get(s.substring(i, i + 2));
				i += 2;
			} else {
				res += map.get(s.substring(i, i + 1));
				i++;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		String a = "LVIII";
		System.out.println(romanToInt(a));

	}

}
