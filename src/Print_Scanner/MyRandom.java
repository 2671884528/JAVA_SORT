package Print_Scanner;

public class MyRandom {
    public static void myRandom(int a[]) {
        for (int i = 0; i < a.length; i++){
            a[i] =(int) (Math.random()*1000);
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}
