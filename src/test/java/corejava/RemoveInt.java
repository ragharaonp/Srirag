package corejava;

public class RemoveInt {

	public static void main(String[] args) {
		String str = "Raghav123";
		String newStr = "";
		char[] chr = str.toCharArray();
		for (char c:chr) {
			if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
				newStr += c;
			}
		}
		System.out.println(newStr);
	}
}
