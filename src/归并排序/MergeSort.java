package 归并排序;

/*
归并排序（MERGE-SORT）是利用归并的思想实现的排序方法
，该算法采用经典的分治（divide-and-conquer）策略
（分治法将问题分(divide)成一些小的问题然后递归求解，
而治(conquer)的阶段则将分的阶段得到的各答案"修补"在一起，即分而治之)
 */
public class MergeSort {
    public static void main(String[] args) {
        int a[] = new int[10];
        Print_Scanner.MyScanner.myScanner(a);
        sort(a);
        Print_Scanner.Myprint.myprint(a);
    }

    public static void sort(int[] a) {
        int[] temp = new int[a.length];
        mergeSort(a, 0, a.length - 1, temp);
    }

    /**
     * @param a     递归的原数组
     * @param left  数组的左指针
     * @param right 数组的右指针
     * @param temp  复制数组，中间数组，暂时存放数据
     */
    public static void mergeSort(int[] a, int left, int right, int[] temp) {
        if (left < right) {
            int min = (left + right) / 2;
            mergeSort(a, left, min, temp);
            mergeSort(a, min + 1, right, temp);
            merge(a, left, min, right, temp);
        }
    }

    /**
     * 每两个相邻的片段排序
     * @param a
     * @param left
     * @param min
     * @param right
     * @param temp
     */
    private static void merge(int a[], int left, int min, int right, int temp[]) {
        int i = left;
        int j = min+1;
        int t = 0;
        //将下标i和下标j所对应的数据比较大小从小到大排列
        while (i <= min && j <= right) {
            if (a[i] <= a[j]) {
                temp[t++] = a[i++];
            } else {
                temp[t++] = a[j++];
            }
        }
        //将i中的较大的加载到临时temp
        while (i <= min) {
            temp[t++] = a[i++];
        }
        //j中多余的较大的加载到临时temp
        while (j <= right) {
            temp[t++] = a[j++];
        }
        t = 0;
        //将分的temp数组传给分的a数组
        while (left <= right) {
            a[left++] = temp[t++];
        }
    }
}
