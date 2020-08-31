package day_005;
import java.util.Scanner;
public class Homework_001 {
    public static void main(String[] args){
        int a;
        int b;
        int count=0;

        System.out.println(fangfa());
        Scanner df=new Scanner(System.in);
        Scanner fa=new Scanner(System.in);
        long d=df.nextLong();
        long f=fa.nextLong();

        System.out.println(add(d,f));
    }

    public static int fangfa(){
        System.out.println("请输入第一个数字");
        Scanner ab=new Scanner(System.in);
        System.out.println("请输入第二个数字");
        Scanner ba=new Scanner(System.in);
        int a=ab.nextInt();
        int b=ba.nextInt();
        int fangfa = a + b;
        return fangfa;


    }
    public static long add(long d,long f){
        return d+f;
    }

}
