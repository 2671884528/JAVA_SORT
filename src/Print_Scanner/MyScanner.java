package Print_Scanner;

import java.util.Scanner;

public class MyScanner {

    //自定义输入数组
    public static void myScanner(int a[]){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
    }
}
