package day_004;
/*
*   二维数组，数组里存的还是数组
*
*       定义方式和一维数组很相似
*
*       int[][] arr=new int[3][4]
*       [3] 表示二维数组中，有三个一维数组
*       [4] 表示三个一维数组中，每个数组的长度
* */
public class ArryArryDemo {
    public static void main(String[] args){
        int[][] arr=new int[3][4];
        //打印位置
        System.out.println(arr);
        System.out.println(arr[1]);
        //报错
        //System.out.println(arr[2][4]);

        System.out.println(arr[2][3]);
    }
}
