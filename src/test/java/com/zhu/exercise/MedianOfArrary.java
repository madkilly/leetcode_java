package com.zhu.exercise;

import org.junit.Test;

/**
 * Created by zhukai on 2017/6/27.
 */
public class MedianOfArrary {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = nums1;
        int[] b = nums2;
        int m = nums1.length;
        int n = nums2.length;

        if (n < m) {
            a = nums2;
            b = nums1;
            m = a.length;
            n = b.length;
        }
        if (n == 0) {
            //return null;
        }

        int imin = 0, imax = m, half_len = (m + n + 1) / 2;
        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = half_len - i;
            if (i < m && b[j - 1] > a[i]) {
                imin = i + 1;
            } else if (i > 0 && a[i - 1] > b[j]) {
                imax = i - 1;
            } else {
                //i is perfect
                int max_left;
                int min_right;
                if(i==0){
                    max_left = b[j-1];
                }else if (j==0){
                    max_left = a[i-1];
                }else{
                    max_left = Math.max(a[i-1],b[j-1]);
                }
                if((m+n)%2==1){
                    return max_left;
                }
                if(i==m){
                    min_right = b[j];
                }else if(j==n){
                    min_right = a[i];
                }else{
                    min_right = Math.max(a[i],b[j]);
                }
                return  (max_left+min_right)/2.0;
            }

        }
        return 0;
    }
    @Test
    public void testalgorithm(){
        int[] a= {1,3,4};
        int[] b = {2};
        double result = findMedianSortedArrays(a,b);
        System.out.println(result);
    }
}
