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
    
    public double findMedianSortedArrays1(int[] A, int[] B) {
	    int m = A.length, n = B.length;
	    int l = (m + n + 1) / 2;
	    int r = (m + n + 2) / 2;
	    return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
	}

public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
	if (aStart > A.length - 1) return B[bStart + k - 1];            
	if (bStart > B.length - 1) return A[aStart + k - 1];                
	if (k == 1) return Math.min(A[aStart], B[bStart]);
	
	int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
	if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1]; 
	if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];        
	
	if (aMid < bMid) 
	    return getkth(A, aStart + k/2, B, bStart,       k - k/2);// Check: aRight + bLeft 
	else 
	    return getkth(A, aStart,       B, bStart + k/2, k - k/2);// Check: bRight + aLeft
}
    
    
    @Test
    public void testalgorithm(){
        int[] a= {1,1};
        int[] b = {1,2};
        double result = findMedianSortedArrays(a,b);
        System.out.println(result);
    }
}
