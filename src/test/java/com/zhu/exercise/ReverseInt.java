package com.zhu.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class ReverseInt {

	public int getReverseInt(int raw){
		boolean positive_flag=true;
		if(raw<0){
			raw=-raw;
			positive_flag=false;
		}
		Queue<Integer> tq = new LinkedList<Integer>();
		Integer tmp_raw= raw;
		while(tmp_raw!=0){
			Integer mod = tmp_raw%10;
			tmp_raw = tmp_raw/10;
			tq.add(mod);
			
		}
		Integer result=0;
		while(!tq.isEmpty()){
			result*=10;
			result+=tq.poll();
		}
		if(!positive_flag){
			result=-result;
		}
		return result;
	}
	@Test
	public void testreserve(){
		int result = getReverseInt(12345);
		System.out.println(result);
	}
	
}
