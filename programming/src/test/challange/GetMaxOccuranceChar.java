package test.challange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GetMaxOccuranceChar {
    
    static void findMaximumOccurring(String str){
		int maximumCount =0;
		HashMap<Character, Integer> characterCountMap = new HashMap<>();
		for (int i = 0; i <str.length() ; i++) {
			char c = str.charAt(i);
			if(characterCountMap.containsKey(c)){
				int count = characterCountMap.get(c);
				count++;
				if(maximumCount<count)
					maximumCount++;
				characterCountMap.put(c, count);
			}else{
				characterCountMap.put(c, 1);
			}
		}
 
		Set<Character> set = characterCountMap.keySet();
		Iterator<Character> iterator = set.iterator();
		while(iterator.hasNext()){
			char key = iterator.next();
			//check count
			if(characterCountMap.get(key)==maximumCount){
				System.out.println("Character: " + key + " has occurred maximum times in \""+str+"\":  " +  maximumCount);
			}
		}
	}
 
	public static void main(String[] args) {
		String str1 = "Maham Ali";
		findMaximumOccurring(str1.toUpperCase());
		System.out.println("----------------------");
		String str2 = "Mahnoor Ali";
		findMaximumOccurring(str2.toUpperCase());
	}
}