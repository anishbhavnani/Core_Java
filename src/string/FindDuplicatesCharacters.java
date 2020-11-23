package string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesCharacters {
	
	HashMap<Character, Integer> findDup(String str){
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character ch:str.toCharArray()){
			if(hm.containsKey(ch))
				hm.put(ch, hm.get(ch)+1);
			else
				hm.put(ch, 1);
		}
		return hm;
	}
	public static void main(String[] args) {
		String str="abcabcd";
		FindDuplicatesCharacters obj=new FindDuplicatesCharacters();
		System.out.println("Duplicates using hashmap");
		HashMap<Character,Integer> hm=obj.findDup(str);
		for(Map.Entry<Character, Integer> kv:hm.entrySet()){
			if(kv.getValue()>1)
				System.out.println(kv.getKey());
		}
	}
}
