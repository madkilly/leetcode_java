package com.zhu.exercise.string;

import org.junit.Test;

public class atoi {
    public int myAtoi(String str) {
        int result=0;
        boolean isNegative = false;
        boolean isFirst = false;
        int length = str.length();
        char[] tmparray = new char[length];
        str.getChars(0,length-1,tmparray,0);

        for (int i =0 ;i<length;i++){
            char tmpchar = tmparray[i];

            if(isInteger(tmpchar)){
                if(isFirst){
                    isFirst=false;
                }
                result*=10;
                if (result>Integer.MAX_VALUE/10){
                    return Integer.MAX_VALUE;
                }else if(Integer.MAX_VALUE-result>=((int)tmpchar)-48){

                }
                result+=((int)tmpchar)-48;
//              结果超过integer max min 的处理

            }else{
                if(isFirst&&tmpchar=='-'){
                    if(isInteger(tmparray[i+1])){
                        isNegative=true;
                        isFirst=false;
                    }
                }
                if(isFirst){
                    continue;
                }
                break;

            }
        }
        if(isNegative){
            result =-result;
        }
        return result;
    }

    public boolean isInteger(char c){
        if(((int)c)>=48&&((int)c)<=57){
            return true;
        }else{
            return false;
        }
    }

    @Test
    public void  test(){
        int asciiValue = 53;
       // int numericValue = Character.getNumericValue(asciiValue);

        System.out.println((int)'0');
        System.out.println((int)'9');
        System.out.println((int)'+');
        System.out.println((int)'-');
        System.out.println((int)' ');
    }
}
