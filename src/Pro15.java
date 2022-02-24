
public class Pro15 {
	public static int hammingWeight(int n) {
		int i = 0;
		while (n > 0) {
			i += n % 2;
			n = n / 2;
		}
		return i;
	}

	public static void main(String[] args) {

		int n = 11;
		System.out.println(hammingWeight(n));

	}

}
