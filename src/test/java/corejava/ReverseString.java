package corejava;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Raghav";
		String newStr = "";
		char[] chArr = str.toCharArray();
		for(int i=chArr.length-1; i>=0; i--) {
			newStr += chArr[i];
		}
		System.out.println(newStr);
	}
}
