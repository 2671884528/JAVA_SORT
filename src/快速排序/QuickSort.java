package 快速排序;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = new int[8];

        init(a);
        quickSort(a,0,a.length-1);
        myprint(a);
    }

    //排序算法(循环一次)
    protected static int findPos(int[] a, int low, int high){

        int temp = a[low];
        while (low<high){
            while (low<high && a[high]>=temp){
                high--;
            }
            a[low] = a[high];
            while (low<high && a[low]<=temp){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }

    //最终排序（完全顺序调用上面的quickSort方法）
    protected static void quickSort(int[] a, int low, int high){
        if (low>high){
            return;
        }
        int pos = findPos(a,low,high);
        quickSort(a,low,pos-1);
        quickSort(a,pos+1,high);
    }

    //自定义输入数组
    protected static void init(int a[]){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
    }

    //自定义输出数组
    protected static void myprint(int a[]){
        for(int temp:a){
            System.out.print(temp + "\t");
        }
        System.out.println();
    }
}
