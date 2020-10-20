package com.demo.countingwords;

import java.util.Scanner;

import com.demo.impl.Rules;

/**
 * Counting Words
 *
 */
public class App extends Rules
{
    public static void main( String[] args )
    {   App app = new App();
    	assumptions();
    	//First case
    	//app.getFirstCase();
        //Second case
    	//app.getSecondCase();
    	//Third case
    	//app.getThirdCase();
		 
    }
    /**
     * @param str with different charchaters 
     * @return removeCharacters with out 
     */
    public String getStringValue(String str) {
    	String removeCharacters = str.replaceAll("[^a-zA-Z]", " ").replaceAll("([,.\\s]+)"," ").toLowerCase();	
    	return removeCharacters;
    }
    /*
     * 
     */
    public void getFirstCase() {
		CountWordFrequency cw = new CountWordFrequency();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter words/letters to get the highest frequency: "); 
		String nextStr = sc1.nextLine();
		cw.calculateHighestFrequency(getStringValue(nextStr));
		sc1.close();
		System.out.println(System.lineSeparator());
    }
    /**
     * 
     */
    public void getSecondCase() {
		CountWordFrequency cw = new CountWordFrequency();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter words/letters to get the frequency of the specific word: ");
		while(sc2.hasNext()) {
		String text = sc2.nextLine();
		System.out.println("Please enter a specific word/letter to get the frequency: "); 
		String word = sc2.nextLine(); 
			  while(!word.matches("[a-zA-Z]+")) {
				  getErrorWordMessage();
				  word = sc2.nextLine();
			  }
			  while(!text.contains(word)) {
				  getErrorWordMessage();
				  word = sc2.nextLine();
			  }
			  if(word.isEmpty()) {
				  getErrorWordMessage();
				  word = sc2.nextLine();
			  }
			  cw.calculateFrequencyForWord(getStringValue(text), word);
			  sc2.close();
			  break;
		  }
		System.out.println(System.lineSeparator());	
    }
    /**
     * 
     */
    public void getThirdCase() {
    	 CountWordFrequency cw = new CountWordFrequency();
		 Scanner sc3 = new Scanner(System.in);
		 System.out.println("Please enter words/letters: "); 
		 String text = sc3.nextLine();
		 System.out.println("Please enter a number: "); 
		 
		 while(sc3.hasNext()) {
			 while(!sc3.hasNextInt()) {
				 getErrorNumberMessage();
				 sc3.next();
			 }
			 int n = sc3.nextInt(); 
			 System.out.println(cw.calculateMostFrequentNWords(getStringValue(text), n));
			 sc3.close();
			 break;
		 }
		
    }
}
