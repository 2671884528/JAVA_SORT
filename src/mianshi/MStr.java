package mianshi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther 郭永钢
 * @data 2020/8/10 16:30
 * @desc:
 */

public class MStr {

    private static MStr mStr = null;

    private MStr() {
    }

    public static MStr getInst() {
        if (mStr == null)
            mStr = new MStr();
        return mStr;
    }

    public String outPrintS(String s) {
        long start = System.currentTimeMillis();

        String[] split = s.split("");
        int count = 0;
        String temp = "";
        String result = split[0];
        //从1开始，防止越界
        for (int i = 1; i < s.length(); i++) {
            //所查字符串和规律字符串逐个比较不相等
            if (!split[i].equals(result.substring(count, count + 1))) {
                result+=temp;
                temp="";
                result += split[i];
            } else {
                //相等
                count++;
                temp += split[i];
                //规律字符长度是否到限制
                if (count >= result.length()) {
                    count = 0;
                    //跳出
                    if (i==s.length()-1){
                       break;
                    }
                }
                //没有到限制，规律字符加上临时存储
                if (i==s.length()-1){
                    result+=temp;
                    temp="";
                    break;
                }


            }

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        return result;
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println(getInst().outPrintS(s));
    }
}
