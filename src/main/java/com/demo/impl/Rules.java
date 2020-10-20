package com.demo.impl;

public class Rules {

	public static void assumptions() {
		System.out.println("********************************************************************************************************");
		System.out.println("\t\t             INTRODUCTION    ");
		System.out.println("********************************************************************************************************");
		System.out.println("The following are assumptions and definitions that limit the scope of the task:");
		System.out.println("\t1 : Word: To simplify, a word is represented by a sequence of one or more characters "
				+ System.lineSeparator() + "\t    between „a‟ and „z‟ or between „A‟ and „Z‟). For example “agdfBh”.");
		System.out.println("\t2 : Letter Case: When counting frequencies, we are interested in the case insensitive "
				+ System.lineSeparator() + "\t    frequency (i.e. in the text “The sun shines over the lake”, the library "
				+ System.lineSeparator() + "\t    should count 2 occurrences for any of the words “the” or “The” or “tHE” etc) ");

		System.out.println("\t3 : Input Text: The input text contains words separated by various separator characters. "
				+ System.lineSeparator() + "\t    Note that the characters from „a‟ and „z‟ and „A‟ and „Z‟ can only appear within words.");
		System.out.println("\t4 : Available Memory: There is enough memory to store the whole input text.");
		System.out.println("");
		System.out.println("________________________________________________________________________________________________________");
	}
	public static void getErrorWordMessage() {
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\tERRROR");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Please enter only a word/letter which match the input text: ");
		
	}
	public static void getErrorNumberMessage() {
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\tERRROR");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Please enter only a number: ");
		
	}
}
