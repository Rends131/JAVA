package aaa;

import java.util.Scanner;


public class digui {
    public static void main(String[] args) {
        System.out.println("递归公式：n!=n*(x-1)*(x-2)*(x-3)....*2*1,0!=1");
        System.out.println("请输入需要递归的数字");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        System.out.println("递归的结果是："+factorial(result));
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
