package corejava;

import java.util.HashMap;
import java.util.Map;

public class CharsCount {

	public static void main(String[] args) {
		String str = "Java Programming";
		char[] strchar = str.toCharArray();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(mp.containsKey(strchar[i])) {
				mp.put(strchar[i], mp.get(strchar[i])+1);
			}
			else
			{
				mp.put(strchar[i], 1);
			}
		}
		
		System.out.println(mp.get('m'));
		
	}

}
