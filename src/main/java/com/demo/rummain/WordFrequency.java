package com.demo.rummain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class WordFrequency {

public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
		
		// Create arrayStr from a string text
		String [] arrayStr = text.split(" ");
		// Create HashMap to store word and it's frequency 
		HashMap<String, Integer> hs = new HashMap<String, Integer>(); 
		// Iterate through array of words 
		for (int i = 0; i < arrayStr.length; i++) { 
			// If word already exist in HashMap then increase it's count by 1 
			if (hs.containsKey(arrayStr[i])) { 
				hs.put(arrayStr[i], hs.get(arrayStr[i]) + 1); 
			} 
			// Otherwise add word to HashMap 
			else { 
				hs.put(arrayStr[i], 1); 
			} 
		} 
			//List<String> keys = new ArrayList<>();
			int highestFrequency = 0;
			List<Integer> values = new ArrayList<>();
			for (Entry<String, Integer> entry : hs.entrySet()) {
			   // if (entry.getValue()==max) {
			        //keys.add(entry.getKey());
			    	//adds max values in ArrayList
			        values.add(entry.getValue());
			        System.out.println("Key -> [" +entry.getKey() +"] and Value -> ["+ entry.getValue()+ "]");
			        highestFrequency = entry.getValue();
			   // }
			}
		
		return null;
	}
}
