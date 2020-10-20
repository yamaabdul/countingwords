package com.demo.rummain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.demo.impl.WordandFrequency;

public class ImplementMain {
	public String getStringValue(String str) {
		String removeCharacters = str.replaceAll("[^a-zA-Z]", " ").replaceAll("([,.\\s]+)"," ").toLowerCase();	
		return removeCharacters;
	}
	
	public int getHigestFrequency(HashMap<String, Integer> hs) {
		int highestFrequency = 0;
		//The maximum value in HashMap 
		int max = Collections.max(hs.values());
		System.out.println("The highest frequency is: -----> " + max );
		//	List<String> keys = new ArrayList<>();
		List<Integer> values = new ArrayList<>();
		for (Entry<String, Integer> entry : hs.entrySet()) {
		    if (entry.getValue()==max) {
		    	//adds max values in ArrayList
		        values.add(entry.getValue());
		        System.out.println("Key -> [" +entry.getKey() +"] and Value -> ["+ entry.getValue()+ "]");
		        highestFrequency = entry.getValue();
		    }
		}
		return highestFrequency;
	}
	
	public int getWordFrequency(HashMap<String, Integer> hs, String word) {
		int values = 0;
		for (Entry<String, Integer> entry : hs.entrySet()) {
			if(entry.getKey().contains(word) ) {
				values = entry.getValue();
			System.out.println("Key -> [" +entry.getKey() +"] and Value -> ["+ entry.getValue()+ "]");
			}
		}
		return values;
	}
	public List<WordandFrequency> getWordenList(HashMap<String, Integer> hs ,List<WordandFrequency>  list, int n){
		for (Entry<String, Integer> entry : hs.entrySet()) {
			list.add(new WordandFrequency(entry.getKey(), entry.getValue()));
		    Collections.sort(list);
		}
		
		 int listsize = list.size();
		 if(listsize != 0 && listsize >=n && n !=0) {
		 List<WordandFrequency> sublist = list.subList(0, n);
		 System.out.println(sublist.toString());
		 }
		 else {
			 System.out.println("The n number is "+ n +" bigger then listsize "+listsize);
		 }
		return list;
	}
}
