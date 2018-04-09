package com.zhu.exercise;

import org.junit.Test;

/**
 * @author zhukai
 *
 *
 *求最长匹配的括号  必须匹配 不能匹配的括号不算入计数 动态规划法
 */
public class LongValidParentheses {
	
    public void testLongValidParentheses(String str){
    	char[] chargp = str.toCharArray();
    	int size =  str.length();
    	int[] len = new int[size+1];
    	int maxlen=0;
/*    	for(int i :len){
    		i=0;
    	}*/
    	
    	for(int i =size-2;i>=0;i--){
    		if(chargp[i]=='('&&i+1+len[i+1]<size&&chargp[i+1+len[i+1]]==')'){
    			len[i]=len[i+1]+2+len[i+2+len[i+1]];
    			maxlen = Math.max(maxlen, len[i]);
    		}
    	}
    	
    	System.out.println(maxlen);
    }
    
    @Test
    public void main(){
    	String str = "((())";
    	testLongValidParentheses(str);
    }
	

}
