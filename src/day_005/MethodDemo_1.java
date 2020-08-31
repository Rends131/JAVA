package day_005;

import java.util.Scanner;

public class MethodDemo_1{
    public static void main(String[] args){
        pringRect();
        int number=getNumber();
        System.out.println(number+5);
    }

    public static int getNumber(){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        return number;
    }

    public static void pringRect(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }


}
