package 堆排序;

import java.util.Scanner;

public class HeapSort {

    public static void main(String[] args) {
        int[] a = new int[10];
        Print_Scanner.MyRandom.myRandom(a);
        heapSort(a);
        Print_Scanner.Myprint.myprint(a);
    }

    //交换方法
    private static void exchange(int a[], int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //循环建堆
    public static void heapSort(int a[]) {
        int len = a.length;
        for (int i = 0; i < a.length - 1; i++) {
            heapSort(a, len - 1 - i);
            exchange(a,0,len-1-i);
        }
    }

    //堆排序
    public static void heapSort(int[] a, int lastIndex) {
        //从最后一个非叶子节点开始
        for (int i = (lastIndex -1)/2; i >= 0; i--) {
            int k = i;
            //k的子节点是否存在
            while (2 * k + 1 <= lastIndex) {
                //k节点的左子节点
                int biggerIndex = 2 * k + 1;
                //右节点存在
                if (biggerIndex < lastIndex) {
                    //右节点和左节点的比较大小
                    if (a[biggerIndex] < a[biggerIndex+1]) {
                        biggerIndex++;
                    }

                }
                //节点k的值和子节点进行比较
                if (a[k] < a[biggerIndex]) {
                    exchange(a, k, biggerIndex);
                    k = biggerIndex;
                } else {
                    break;
                }
            }

        }
    }
}
