package day_004;

public class ArrayDemo_4 {
    public static void main(String[] args){
        int[] arr={5,3,6};
        //数组越界，只有0,1,2 索引，此处打印索引3，会出错
        System.out.println(arr[3]);

        int[] abc={0,2,3};
        System.out.println(abc[2]);
       // abc[2]=null;  abc[2]是内存地址，然后等于null清空内存地址，所有在打印就是为空
        System.out.println(abc[2]);
    }
}
