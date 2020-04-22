package com.zhu.utils;

public class BubbleSort {

    public static void sort(int[] array){
        int length = array.length;
        for(int i=0;i<length-1;i++){
            for(int j=i;j<length-1;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }

    public static void sort(Integer[] array){
        int length = array.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
}
