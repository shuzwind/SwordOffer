
public class Pro5 {
	
	public static String replaceSpace(String s) {
		String a = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (Character.isSpace(c)) {
				a += "20%";
			} else {
				a += c;
			}
		}
		return a;

    }
	
	public static void main(String[] args) {
		String a = "We are happy.";
		System.out.println(replaceSpace(a));
	}

}
