package com.zhu.sword;

//source：We Are Happy
//target: We%20Are%20Happy

import org.junit.Test;

public class URLencodeBlank {

    public void encode(char[] source){
        System.out.println(source);
        int newpt=0;
        int oldpt=0;

        oldpt=source.length;
        int blank=0;
        for(int i=0;i<oldpt;i++){
            if(source[i]==' '){
                blank++;
            }
        }
        newpt=source.length+blank*2;
        char[] target = new char[newpt];
        newpt--;
        for(int j =oldpt-1;j>=0;j--){
            if(source[j]!=' '){
                target[newpt--]=source[j];
            }else{
                target[newpt--]='0';
                target[newpt--]='2';
                target[newpt--]='%';
            }
        }
        System.out.println(target);

    }

    @Test
    public void dotest(){
        encode("We Are Happy".toCharArray());
    }
}
