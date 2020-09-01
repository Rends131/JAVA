package chap17_3;

import chap15_1.Studnet;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Studnet s=new Studnet();
        System.out.println("s"+s);
        short c =10;
        short d =20;
//        System.out.println(compare(c,d));
        int[] arr={1,2,3,4,5};
        for (int min =0,max = arr.length-1 ; min <= max; max--,min++) {
            int temp = arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }


    public static boolean compare(short a,short b){
        System.out.println("shot");
        return a==b;
    }
    public static int num(){
        int num=0;
        for (int i = 0; i <= 100 ; i++) {
            num+=i;
        }
        return num;
    }
}
