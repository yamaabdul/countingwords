package com.demo.impl;

public class WordandFrequency implements Comparable<WordandFrequency> {
	public String word;
	public int frequency;

	public WordandFrequency(String word, int frequency) {
		super();
		this.word = word;
		this.frequency = frequency;
	}
	
	   
	  public String getWord() {
	  return this.word; 
	  }
	  
	  public int getFrequency() { 
	  return this.frequency; }
	 

	@Override
	public int compareTo(WordandFrequency ob) {
		//sort in ascending order 
		int compare = Integer.compare(ob.getFrequency(), this.frequency);
		return compare != 0 ? compare : this.word.compareTo(ob.getWord());
	}
	public String toString() {
		
		return "(\""+word + "\"," + frequency+")";
	}
}
