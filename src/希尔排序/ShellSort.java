package 希尔排序;

import java.util.Arrays;

/*
 * 针对直接插入排序的下效率问题，有人对次进行了改进与升级，
 * 这就是现在的希尔排序。希尔排序，也称递减增量排序算法，
 * 是插入排序的一种更高效的改进版本。希尔排序是非稳定排序算法
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] a = new int[80000];
//        Print_Scanner.MyRandom.myRandom(a);
        for (int i = 0; i < 80000; i++) {
            a[i] = (int) (Math.random()*80000);
        }
        long start1 = System.currentTimeMillis();
        shellSort(a);
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);
        long start2 = System.currentTimeMillis();
        shellSort2(a);
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

//        Print_Scanner.Myprint.myprint(a);
    }

    /*交换法，耗时间
     * 原因：在做最后一步交换的时候，如果后面还存在小的数，
     * 需要和之前的数一个一个的交换，比较耗时，改进采用移步法
     * */
    public static int[] shellSort2(int a[]) {
        int step = a.length / 2;
        int temp = 0;
        while (step > 0) {
            //分成的组数,5-2,2-5,1-10
            for (int i = step; i < a.length; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if (a[j] > a[j + step]) {
                        temp = a[j];
                        a[j] = a[j + step];
                        a[j + step] = temp;
                    }
                }
            }
            step = step / 2;
        }
        return a;
    }

    /*移步法，*/
    public static int[] shellSort(int a[]) {
        for (int grap = a.length / 2; grap >= 1; grap /= 2) {
            for (int j = grap; j < a.length; j++) {
                if (a[j] <= a[j - grap]) {
                    int temp = a[j];
                    int k = j - grap;
                    while (k >= 0 && a[k] > temp) {
                        a[k + grap] = a[k];
                        k -= grap;
                    }
                    a[k + grap] = temp;
                }

            }
        }
        return a;
    }

}
