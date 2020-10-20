package com.demo.rummain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.demo.impl.WordandFrequency;
import com.demo.interfaceclass.WordFrequencyAnalyzer;

public class RunMain extends ImplementMain implements WordFrequencyAnalyzer{
	static String path = "./resource/ord.txt";
	public static void main(String[] args) {
		RunMain app = new RunMain();
		//app.calculateHighestFrequency (path);
		//app.calculateFrequencyForWord(path, "computer");
		app.calculateMostFrequentNWords(path, 4);
	}
	
	@Override
	public int calculateHighestFrequency (String path) {
		// Create HashMap to store word and it's frequency 
		HashMap<String, Integer> hs = new HashMap<String, Integer>(); 
		int highestFrequency = 0;
		try {
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				String arrayStr[] = getStringValue(line).split(" ");
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
			}
			getHigestFrequency(hs);
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return highestFrequency;
	}
	
	@Override
	public int calculateFrequencyForWord(String text, String word) {
	// Create HashMap to store word and it's frequency 
		HashMap<String, Integer> hs = new HashMap<String, Integer>(); 
		int highestFrequency = 0;
		try {
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				String arrayStr[] = getStringValue(line).split(" ");
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
			}
			getWordFrequency(hs, word);
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return highestFrequency;
	}

	@Override
	public List<WordandFrequency> calculateMostFrequentNWords(String text, int n) {
		// Create HashMap to store word and it's frequency 
				HashMap<String, Integer> hs = new HashMap<String, Integer>(); 
				List<WordandFrequency> list= new ArrayList<>();
				try {
					File file = new File(path);
					FileReader fileReader = new FileReader(file);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					String line;
					
					while ((line = bufferedReader.readLine()) != null) {
						String arrayStr[] = getStringValue(line).split(" ");
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
					}
					getWordenList(hs, list, n);
					fileReader.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
		return list;
	}
}
