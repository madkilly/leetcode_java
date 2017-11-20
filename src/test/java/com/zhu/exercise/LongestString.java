package com.zhu.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhukai on 2017/6/22.
 * 求一个字符串中最长不重复子字符串的长度。
 * 最佳算法：用一个hashmap 存储最后一次见到该字符时的位置。
 *设置标志位i，j。成员变量max存储最长字符串长度。
 * i为遍历标志位。j位当前最长串的开始位置
 * 开始遍历ij都置为0. 遇见没见过的字符时将字符加入map。并记录该字符位置。
 * 当遇到重复的字符时 j和重复字符位置 进行比较取较大值
 * 计算max 遍历置结束
 */
public class LongestString {
    public int lengthOfLongestSubstring(String s) {
        List<Character> result = new ArrayList<Character>();
        List<Character> tmp = new ArrayList<Character>();

        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(!tmp.contains(c)){
                tmp.add(c);
            } else{
                if(result.size()<tmp.size()){
                    result.clear();
                    result.addAll(tmp);
                }
                int indexdup = tmp.indexOf(c);
                if(indexdup+1<tmp.size()){
                    tmp = tmp.subList(indexdup+1, tmp.size());
                }else{
                    tmp.clear();
                }
                tmp.add(c);
            }
        }
        if(result.size()<tmp.size()){
            result.clear();
            result.addAll(tmp);
        }
        return result.size();

    }

    public int lengthOfLongestSubstring1(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

    @Test
    public void testLongest(){
        String s = "anxaf";
        int i = lengthOfLongestSubstring(s);
        System.out.printf(String.valueOf(i));
    }
}
