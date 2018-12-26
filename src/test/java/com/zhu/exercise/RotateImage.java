package com.zhu.exercise;

import org.junit.Test;

public class RotateImage {

	public static int[][] rotateImage(int[][] image) {
		int n = image.length;
		int [][] result = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++ ) {
				result[i][j]=image[n-1-j][i];
			}
		}
		return result;
	}

	@Test
	public void testRotate() {
		int[][] image = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] result = rotateImage(image);
		
		int n=image.length;
		
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++ ) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
	}

}
