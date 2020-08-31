package day_004;
/*定义数组容器

* 定义数组容器，要素，强制数据类型的语言
* 必须有数据类型，大小，就是个存储数据的个数
* 定义数组公式：
*   数据类型[]变量名 = new 数据类型[存储元素的个数]；
*
*       数据类型：数组中存储元素的数据类型
*       []标识数组意思
*
*       1，ArryDemo.class进入方法区
*       2，main函数进入方法栈
*       3，new int[3]在方法堆中运行
*   java提供一个属性，操作索引的
*   数组的一个属性，就是数组的长度，属性的名字 length
*   使用属性：数组名.length 数据类型 int
*   数组的最小索引是0，最大索引数是.length-1
* */


public class ArrayDemo {
    public static void main(String[] args){
        //定义数组，存储整数，容器长度，3个
        //数据类型[] 变量名=new 数据类型[存储元素的个数]
        int[] arr=new int[3];
        // 打印出在 堆 中的位置
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
