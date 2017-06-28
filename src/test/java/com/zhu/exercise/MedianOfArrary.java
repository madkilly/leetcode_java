package com.zhu.exercise;

/**
 * Created by zhukai on 2017/6/27.
 */
public class MedianOfArrary {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] a =nums1;
        int [] b =nums2;
        int m = nums1.length;
        int n = nums2.length;

        if(n<m){
            a=nums2;
            b=nums1;
            m=a.length;
            n=b.length;
        }
        if(n==0){
            //return null;
        }

        int imin=0,imax=m,half_len =(m+n+1)/2;
        while(imin<imax){
            int i =(imin+imax)/2;
            int j = half_len-i;
            if(i<m&&a[i-1]>b[j]){
                imin = i+1;
            }else if(i>0&&b[j-1]>a[i]){
                imax=i-1;
            }else{
                //i is perfect

            }

        }



        return 0;
    }
=======

>>>>>>> origin/master
}
