package 插入排序;
import Print_Scanner.MyScanner;
import Print_Scanner.Myprint;

/*
 * 插入排序类似整理扑克牌，将每一张牌插到其他已经有序的牌中适当的位置。
 * 插入排序由N-1趟排序组成，对于P=1到N-1趟，插入排序保证从位置0到位置P上的元素为已排序状态。
 * 简单的说，就是插入排序总共需要排序N-1趟，从index为1开始，讲该位置上的元素与之前的元素比较
 * 放入合适的位置，这样循环下来之后，即为有序数组。
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = new int[10];
        MyScanner.myScanner(a);
        insertSort(a);
        Myprint.myprint(a);
    }

    //排序算法
    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
    }

}
