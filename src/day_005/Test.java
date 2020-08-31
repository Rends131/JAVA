package day_005;


import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();

        System.out.println(add(a,b));
        printXing(3,5);

    }
    // 键盘接收两个数字，求和
    public static long add(long a,long b){
        return a+b;
    }

    //键盘接收三个数字，获取两个比较大的值（整数和小数）
    public static long max(long a,long b,long c){
        return a > b ? a : b > c ? a > b ? a : b : c;
    }

    //打印 n行，m列的 * 号
    public static void printXing(int n,int m){
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
    public static void printPrime() {
        int a, b, count = 0;
        for (a = 100; a <= 200; a++) {
            for (b = 10; b < a; b++) {
                if (a % b == 0) {
                    break;
                }
            }
            if (a == b) {
                if (count % 5 == 0) {
                    System.out.println();
                }
                count++;
                System.out.print(a + " ");

            }
        }
    }

}
