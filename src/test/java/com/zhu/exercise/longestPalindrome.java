package com.zhu.exercise;

import org.junit.Test;

/**
 * @author zhukai
 *最长回文
 */
public class longestPalindrome {
	
	public String getPalindrome(String s) {
		InnerClass params = new InnerClass();
		for (int i =0;i<s.length();i++) {
			//搜索奇数情况 nan
			searchPD(s, i, i, params);
			//搜索偶数情况noon
			searchPD(s, i, i+1, params);
		}
		
		return s.substring(params.startindex, params.endindex+1);
	}
	
	public void searchPD(String s,Integer lp,Integer rp,InnerClass params) {
		while(lp>=0&&rp<s.length()&&s.charAt(lp)==s.charAt(rp)) {
			--lp;
			++rp;
		}
		if(params.maxlen<rp-lp-1) {
			params.startindex=lp+1;
			params.endindex=rp-1;
			params.maxlen=rp-lp-1;
		}
	}
	
    class InnerClass{
		Integer maxlen=0;
		Integer startindex=0;
		Integer endindex=0;
    }
    
	@Test
	public void testlongPD() {
		String str="babad";
		String out = getPalindrome(str);
		System.out.println(out);
	}


}
