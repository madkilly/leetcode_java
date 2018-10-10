package com.zhu.commontest;

import org.junit.Test;

/**
 * @author	zhukai
 * @date	2018年10月10日
 * Description:
 */
public class TestBoxTypeSlow {
	
	private static long sum() {
		//Long 包装类导致计算过程中产生了Integer.MAX_VALUE(2 23次方)个Long对象
		Long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
		sum += i;
		return sum;
		}
	
	private static long sumFast() {
		long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
		sum += i;
		return sum;
		}
	
	@Test
	public void testSlow() {
		long start = System.currentTimeMillis();
		sumFast();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	@Test
	public void testFast() {
		long start = System.currentTimeMillis();
		sum();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
