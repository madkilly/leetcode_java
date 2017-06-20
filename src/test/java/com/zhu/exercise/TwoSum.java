package com.zhu.exercise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * <p>Title: TwoSum</p>
 * <p>Description: </p>
 * @author zhukai
 */
public class TwoSum {
	
    public int[] twoSum1(int[] nums, int target) {
    	int i =0;
    	int k =0;
    	int[] result = new int[2];
    	for(;i<nums.length;i++){
    		int tmp = nums[i];
    			for(k=i+1;k<nums.length;k++){
    				if(nums[k]+tmp==target){
    					result[0]=i;
    					result[1]=k;
    				}
    			}
    	}
        return result;
    }
    
    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
	
	@Test
	public void testTwosum(){
		int[] nums = {-1,-2,-3,-4,-5};
		int target=-8; 
		int[] result = twoSum2(nums,target);
		for(int s : result){
			System.out.println(s);
			
		}
	}

}
