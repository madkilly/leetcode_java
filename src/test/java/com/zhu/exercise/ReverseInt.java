package com.zhu.exercise;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class ReverseInt {

	public int getReverseInt(int raw_input){
		Long raw = new Long(raw_input);
		boolean positive_flag=true;
		if(raw<0){
			raw=-raw;
			positive_flag=false;
		}
		Queue<Long> tq = new LinkedList<Long>();
		Long tmp_raw= raw;
		while(tmp_raw!=0){
			Long mod = tmp_raw%10;
			tmp_raw = tmp_raw/10;
			tq.add(mod);
			
		}
		Long result=(long) 0;
		while(!tq.isEmpty()){
			result*=10;
			result+=tq.poll();
		}
		if(result>Integer.MAX_VALUE) {
			result=(long) 0;
		}
		if(!positive_flag){
			result=-result;
		}
		return result.intValue();
	}
	
	
	/**
	 * @param x
	 * @return
	 * 改成一次循环
	 */
	public int enhanceReverse(int x) {
		boolean negative_flag = false;
		long tmp = 0;
		if(x<0) {
			negative_flag=true;
			x-=x;
		}
		
		while(x!=0) {
			tmp=tmp*10;
			tmp+=x%10;
			x/=10;
		}
		if(tmp >Integer.MAX_VALUE) {
			return 0;
		}else if(negative_flag){
			tmp=-tmp;
			return (int) tmp;
		}
		return (int)tmp;
	}
	
	@Test
	public void testreserve(){
		int result = getReverseInt(634);
		int result2 = enhanceReverse(4561351);
		System.out.println(result);
		System.out.println(result2);
	}
	
}
