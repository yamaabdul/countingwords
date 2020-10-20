package com.demo.countingwords;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.demo.impl.WordandFrequency;

/**
 * Unit test for demo App.
 */
public class AppTest 
{   
	 
    @Test
    public void getStringValuefromInput()
    { 	App app = new App();
    	String str = "a b . c d e f 1a$&*(";
        assertEquals(app.getStringValue(str), "a b c d e f a " );
        assertNotNull(app.getStringValue(str));
        
    }
    @Test
    public void getFirstcase() {
    	CountWordFrequency cw = new CountWordFrequency();
    	App app = new App();
    	String str = "a b . c d e f 1a$&*( a";
    	String str2 = app.getStringValue(str);
    	int max = cw.calculateHighestFrequency(str2);
    	assertEquals(max, 3);
    }
    
    @Test
    public void getSecondcase() {
    	App app = new App();
    	CountWordFrequency cw = new CountWordFrequency();
    	String str = "a b . c d e f 1a$&*( a";
    	String str2 = app.getStringValue(str);
    	String a = "a";
    	assertEquals(cw.calculateFrequencyForWord(str2, a), 3);
    }
    @Test
    public void getThirdcase() {
    	App app = new App();
    	CountWordFrequency cw = new CountWordFrequency();
    	String str = "a b . c d e f 1a$&*( a";
    	String str2 = app.getStringValue(str);
    	String str3 = "[(\"a\",3), (\"b\",1), (\"c\",1)]";
    	assertEquals(cw.calculateMostFrequentNWords(str2, 3), str3);
    }
}
