package com.zhu.sword;

/*

在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
    找出数组中重复的数字
Input:
        {2, 3, 1, 0, 2, 5}

Output:
        2

特征：
    用占位的方法解决 遍历和排序问题，通过一次遍历将元素放入应处位置，如果过程中位置被占用则该元素重复。
*/

import org.junit.Test;

public class DuplicateNum {

    int[] nums ={2, 3, 1, 0, 2, 5};

    public void swap (int[] nums,int source,int target){
        int temp=nums[source];
        nums[source]=nums[target];
        nums[target]=temp;
    }

    public int findDuplicatNum(int[] nums){
        int length = nums.length;
        for(int i=0;i<length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                swap(nums,i,nums[i]);
            }
        }

        return 0;
    }

    @Test
    public void testDuplicate(){
        System.out.println(findDuplicatNum(nums));

    }




}
