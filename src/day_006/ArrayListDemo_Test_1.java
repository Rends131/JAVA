package day_006;

/*
    ArrayList 集合中的 方法
    add() 向集合中添加元素
    方法中的参数类型，定义集合对象时候的类型是一样的

    arrar.add()

    get(int index) 取出集合中的元素，get方法的参数，写入索引

    size() 返回集合的长度，集合存储元素的个数
 */

import java.util.ArrayList;

public class ArrayListDemo_Test_1 {
    public static void main(String[] args){
        //定义集合，存储字符串元素
        ArrayList<String>array=new ArrayList<String>();

        //调用集合方法add存储元素
        array.add("abc");
        array.add("script");
        array.add("java");
        array.add("python");
        //打印集合长度，调用集合size方法，siez方法返回类型为int
        int size=array.size();
        System.out.println(size);

        //获取集合中的一个元素，获取1索引的元素，
        //集合的方法get，获取元素后结果数据类型
        String s= array.get(1);
        System.out.println(s);

    }
}
