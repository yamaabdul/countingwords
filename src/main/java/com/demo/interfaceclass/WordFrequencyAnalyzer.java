package com.demo.interfaceclass;

import java.util.List;

import com.demo.impl.WordandFrequency;

public interface WordFrequencyAnalyzer {
	int calculateHighestFrequency(String text);
	int calculateFrequencyForWord (String text, String word);
	List<WordandFrequency> calculateMostFrequentNWords (String text, int n);
}
