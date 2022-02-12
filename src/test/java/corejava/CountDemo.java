package corejava;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountDemo {

	public static void main(String[] args) {
		String str = "Java Program";
		char[] charArr = str.toCharArray();
		Map<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++ ) {
			if(!(charArr[i]==' ')) {
				if(hMap.containsKey(charArr[i])) {
					hMap.put(charArr[i], hMap.get(charArr[i])+1);
				}
				else {
					hMap.put(charArr[i], 1);
				}	
			}
		}
		System.out.println("Chars and count: \n"+hMap);
	}
}
