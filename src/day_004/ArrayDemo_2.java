package day_004;

public class ArrayDemo_2 {
    public static void main(String[] args){
        //定义数组，定义的同时，对元素进行赋值
        int[] arr=new int[]{1,2,3,4,5,6,7};
        System.out.println(arr.length);
        System.out.println(arr[5]);

        //定义数组，直接大括号赋值，最常用
        System.out.println("===========");
        int[] arr2={0,2,4,6,8};
        System.out.println(arr2.length);
        System.out.println(arr2[5]);
    }
}
