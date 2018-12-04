package 简单选择排序;

import Print_Scanner.*;

/*
简单选择排序(最小到最大找最小版本)
常用于取序列中最大最小的几个数时。
(如果每次比较都交换，那么就是交换排序；如果每次比较完一个循环再交换，就是简单选择排序。)
遍历整个序列，将最小的数放在最前面。
遍历剩下的序列，将最小的数放在最前面。
重复第二步，直到只剩下一个数。
 */
public class SelectSort {
    public static void main(String[] args) {
        int a[] = new int[10];
        MyScanner.myScanner(a);
        selectSort(a);
        Myprint.myprint(a);
    }

    public static void selectSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

}
