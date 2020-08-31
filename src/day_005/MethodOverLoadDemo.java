package day_005;

/*          方法重载名
*
*
* */

public class MethodOverLoadDemo {
    public static void main(String[] args){
        //对于重载调用，根据参数传递区分
        //
        int sum = getSum(3,4);
        System.out.println(sum);

        double a=getSum(3.4,5.6);
        System.out.println(a);

    }
    public static int getSum(int a,int b){
        System.out.println("两个int参数");
        return a+b;
    }
    public static int getSum(int a,int b,int c){
        System.out.println("3个int参数");
        return a+b+c;
    }
    public static double getSum(double a, double b){
       System.out.println("两个doubule参数");
       return a+b;
    }
}
