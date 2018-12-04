package 希尔排序;

/*
 * 针对直接插入排序的下效率问题，有人对次进行了改进与升级，
 * 这就是现在的希尔排序。希尔排序，也称递减增量排序算法，
 * 是插入排序的一种更高效的改进版本。希尔排序是非稳定排序算法
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] a = new int[10];
        Print_Scanner.MyRandom.myRandom(a);
        shellSort(a);
        Print_Scanner.Myprint.myprint(a);
    }

    public static void shellSort(int a[]) {
        for (int grap = a.length / 2; grap >= 1; grap /= 2) {
            for (int j = grap; j < a.length; j++) {
                if (a[j] <= a[j - grap]) {
                    int temp = a[j];
                    int k = j-grap;
                    while (k>=0 && a[k] > temp){
                        a[k+grap] = a[k];
                        k -= grap;
                    }
                    a[k+grap] = temp;
                }

            }
        }

    }

}
