package 基数排序;

import java.util.ArrayList;
import java.util.List;

public class BaseSort {

    public static void main(String[] args) {
        int a[] = new int[10];
        Print_Scanner.MyRandom.myRandom(a);
        baseSort(a);
        Print_Scanner.Myprint.myprint(a);
    }

    private static int getMax(int a[]) {
        int max = a[0];
        int len = 0;
        //得到最大的数
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        //得到最大数的长度
        while (max > 0) {
            max /= 10;
            len++;
        }
        return len;
    }

    public static void baseSort(int[] a) {

        int exp = getMax(a);

        //创建十个队列，每个的队列代表0-9十个数
        List<ArrayList<Integer>> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> array = new ArrayList();
            list.add(array);
        }

        for (int i = 0; i < exp; i++) {
            for (int j = 0; j < a.length; j++) {
                //exp对应的位数如果是1，则temp=个位数，如果是10，则代表十位数
                int temp = (a[j] / (int) (Math.pow(10, i))) % 10;
                //临时的一个动态数组
                ArrayList<Integer> array2 = list.get(temp);
                array2.add(a[j]);
                //加载到list中
                list.set(temp, array2);
            }

            //计数器，新数组的下标
            int count = 0;
            for (int k = 0; k < 10; k++) {
                while (list.get(k).size() > 0) {
                    ArrayList<Integer> array3 = list.get(k);
                    a[count] = array3.get(0);
                    array3.remove(0);
                    count++;
                }
            }

        }

    }
}
