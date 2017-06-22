package com.zhu.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhukai on 2017/6/22.
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
