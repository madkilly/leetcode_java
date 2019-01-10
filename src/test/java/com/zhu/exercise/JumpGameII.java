package com.zhu.exercise;

import org.junit.Test;

public class JumpGameII {

	/**
	 * @param A
	 * @return
	 * 贪心法代码
	 * 这题难度标的是hard，感觉难度体现在如何判断贪心法是正确的
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
            	//i再跳多步时会计算,跳过去的台阶中，能跳到的目标是否有能超过当前台阶能跳到的
            	//因此此法并不是完全的贪心法，还是会对上一步的最优解进行比较的
                maxx = maxx>(i + A[i])?maxx:(i + A[i]);
                //i会一步一步的累加至上一步跳到的temp位置，而每步累加都会与当前最优解作比较
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
	
	@Test
	public void testFailgreedy() {
		//int [] a= {2,3,1,1,4};
		int [] a= {1,2,3,1,0,1};
		
		System.out.println(jump(a));
	}
	
}
