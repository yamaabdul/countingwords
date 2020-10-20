package com.demo.countingwords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.demo.impl.WordandFrequency;
import com.demo.interfaceclass.WordFrequencyAnalyzer;

public class CountWordFrequency implements WordFrequencyAnalyzer{

	@Override
	public int calculateHighestFrequency(String text) {
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
		//The maximum value in HashMap 
		int max = Collections.max(hs.values());
		System.out.println("The highest frequency is: -----> " + max );
		List<Integer> values = new ArrayList<>();
		for (Entry<String, Integer> entry : hs.entrySet()) {
		    if (entry.getValue()==max) {
		        values.add(entry.getValue());
		        System.out.println("Key -> [" +entry.getKey() +"] and Value -> ["+ entry.getValue()+ "]");
		    }
		}
		return max;
	}

	@Override
	public int calculateFrequencyForWord(String text, String word) {
		//Create arrayStr from a string text
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
		int values = 0;
		for (Entry<String, Integer> entry : hs.entrySet()) {
			if(entry.getKey().contains(word) ) {
				values = entry.getValue();
			System.out.println("Key -> [" +entry.getKey() +"] and Value -> ["+ entry.getValue()+ "]");
			}
		}
		return values;
	}

	@Override
	public List<WordandFrequency> calculateMostFrequentNWords(String text, int n) {
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
		List<WordandFrequency>  list = new ArrayList<>();
		List<WordandFrequency> sublist = new ArrayList<>();
		for (Entry<String, Integer> entry : hs.entrySet()) {
			list.add(new WordandFrequency(entry.getKey(), entry.getValue()));
		    Collections.sort(list);
		}
		
		 int listsize = list.size();
		 if(listsize != 0 && listsize >=n && n !=0) {
		 sublist = list.subList(0, n);
		 //System.out.println(sublist.toString());
		 }
		 else {
			 System.out.println("The n number is "+ n +" bigger then listsize "+listsize);
		 }
		return sublist;
	}

}
