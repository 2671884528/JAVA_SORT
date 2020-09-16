package mianshi;

import java.util.Scanner;

/**
 * @auther 郭永钢
 * @data 2020/8/11 15:09
 * @desc:
 */

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        long start = System.currentTimeMillis();
        String b[];
        String str;
        for (int i = 1; i < a.length()+1; i++) {
            str = a.substring(0, i);
            b = a.split(str);
            if (b.length == 0) {
                System.out.println(a.length() / str.length() + str);
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
