package com.demo.countingwords;

public class WordAndFrequncy implements Comparable<WordAndFrequncy> {
	public String word;
	public int frequency;

	public WordAndFrequncy(String word, int frequency) {
		this.word = word;
		this.frequency = frequency;
	}
	
	public String getWord() {
	 return word; 
	}
  
	public int getFrequency() { 
	 return frequency; 
	}

	@Override
	public int compareTo(WordAndFrequncy ob) {
		//sort in ascending order 
		int compare = Integer.compare(ob.getFrequency(), this.frequency);
		return compare != 0 ? compare : this.word.compareTo(ob.getWord());
	}
	public String toString() {
		
		return "(\""+word + "\"," + frequency+")";
	}
}
