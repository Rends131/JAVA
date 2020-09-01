package day_006;
/*
    集合ArrarList方法补充
    add(int 索引，存储的元素)将元素添加到指定的索引上
    set(int 索引，修改后的元素)将指定索引的元素，进行修改
    remove(int 索引)删除指定索引上的元素

 */
import java.util.ArrayList;

public class ArrayListDemo_Test_3 {
    public static void main(String[] args){
        ArrayList<Integer>array=new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        //在索引2上，添加元素7
        array.add(2,7);
        //在索引2上，修改层10
        array.set(2,10);
        //在索引3删出
        array.remove(2);
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }

    }
}
