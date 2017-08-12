package com.zhu.exercise;

import java.util.HashMap;

import org.junit.Test;

/**
 * <p>Title: PalindromicString</p>
 * <p>Description: </p>
 * @author zhukai
 */
public class PalindromicString {
	
    public String longestPalindrome(String s) {
    	int start=0,end=1; 
    	HashMap<Character, Integer> tmpMap = new HashMap<Character, Integer>();
    	int max = 0;
    	int i=0,j=0;
    	Character flag=s.charAt(0);
    	for(;i<s.length();i++){
    		if(tmpMap.containsKey(s.charAt(i))){
    			if(max<i-tmpMap.get(s.charAt(i))+1){
    				if(flag!=s.charAt(i)){
    					start=tmpMap.get(s.charAt(i));
    					flag=s.charAt(i);
    				}
    				end=i+1;
    				max= end-start;
    			}
    		}else{
    			tmpMap.put(s.charAt(i), new Integer(i));
    		}

    		
    	}
    	
		return s.substring(start,end);
    }
    
    @Test
    public void testPalindrome(){
    	String s= "abcd";
    	String result = longestPalindrome(s);
    	System.out.print(result);
    }
}
