package com.zhu.exercise;

import org.junit.Test;

public class JumpGameII {

	/**
	 * @param A
	 * @return
	 * 贪心法代码
	 * 这题难度标的是hard，感觉难度体现在模糊的题意上
	 */
	public int jump(int[] A){
        //maxx 当前能跳的最大位置，temp 当前位置，count跳的次数
		int maxx=0,temp=0,count=0;
        for(int i = 0; i < A.length;){
        	//跳到目标位置退出循环
            if(temp >= (A.length-1)) break;
            while(i <= temp)
            {
            	//核心贪心算法每次都跳最多的，？如何证明步数最少？
                maxx = maxx>(i + A[i])?maxx:(i + A[i]);
                i++;
            }
            count++;
            temp = maxx;
        }
        return count;
    }
	
	@Test
	public void testgreedy() {
		//int [] a= {2,3,1,1,4};
		int [] a= {2,1,5,1,1,1,1,1,1,1};
		
		System.out.println(jump(a));
	}
}
