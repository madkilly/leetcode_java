package com.zhu.commontest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TraverseString {
	
	public void TraverseMethod1(char[] str,int findex,List<String> result) {
		
		
		if(str.length-1==findex) {
			result.add(new String(str));
		}

		for(int i= findex;i<str.length;i++) {
			//一维数组是深克隆
			//二维数组要对每一维进行克隆
			char[] newtmps =  str.clone();
			swap(newtmps, findex, i);
			//System.out.println(new String(newtmps));
			TraverseMethod1(newtmps, findex+1, result);
		}
	}
	
	public void  swap(char[] str,int source,int target) {
		char tmp = str[source];
		str[source]=str[target];
		str[target]=tmp;
	}
	
	@Test
	public void TestQuestion() {
		String raw= "abc";
		List<String> result = new ArrayList<String>();
		
		TraverseMethod1(raw.toCharArray(), 0, result);
		
		for (String string : result) {
			System.out.println(string);
		}
	}

}
