package day_004;

import java.util.Scanner;

/*
* switch(){
*   case 常量1:
*       要执行的语句；
*   break;
*
*   case 常量1:
 *       要执行的语句；
 *   break;
 *
 *   case 常量2:
 *       要执行的语句；
 *   break;
 *
 *   case 常量3:
 *       要执行的语句；
 *   break;
*
*    default;
*       要执行的语句；
*    break;
*   }
*   执行流程；表达式，和case后面的常量进行比较
*   和哪个case后的常量相同，就执行哪个case后面的程序，遇到break就全部结束
* */

public class SwitchDemo {
    public static void main(String[] args){
        System.out.println("请输入日期");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("星期不存在");
                break;

        }

    }
}
