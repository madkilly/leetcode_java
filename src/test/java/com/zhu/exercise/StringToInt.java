package com.zhu.exercise;

import org.junit.Test;

/**
 * @author	zhukai
 * @date	2018年9月21日
 * Description:
 */
public class StringToInt {
	
    public int myAtoi(String str) {
    	str = str.trim();
    	int reslut=0;
    	boolean negative_flag = false;
    	for(int i=0;i<str.length();i++) {
    		if(i==0&&str.charAt(i)>57&&(str.charAt(i)!='-'||str.charAt(i)!='+')) {
    			break;
    		}else if(i==0) {
    			if(str.charAt(0)=='-') {
    				negative_flag=true;
    			}
    			continue;
    		}
    		if(str.charAt(i)>57&&i!=0) {
    			break;
    		}
    		int tmp=Integer.valueOf(str.charAt(i))-48;
    		int newResult=reslut*10+tmp;
    		if(reslut!=newResult/10) {
    			if(negative_flag) {
    				return Integer.MIN_VALUE;
    			}else {
    				return Integer.MAX_VALUE;
    			}
    		}
    		reslut=newResult;
    	}
    	if(negative_flag) {
			reslut=-reslut;
    	}
		return reslut;
    }
    
    @Test
    public void test() {
    	int result = myAtoi("-123qw");
    	System.out.println(result);
    }
}
