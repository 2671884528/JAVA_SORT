package 冒泡泡;


import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        bubbleSort(a);
        myPrint(a);
    }

    /**
     * 冒泡排序
0     * @param a
     */
    protected static void bubbleSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; i < a.length - j; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    protected static void myPrint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

}
