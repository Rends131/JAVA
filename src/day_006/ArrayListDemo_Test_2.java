package day_006;

import java.util.ArrayList;

public class ArrayListDemo_Test_2 {
    public static void main(String[] args){
        ArrayList<Integer>array = new ArrayList<Integer>();
        array.add(123);
        array.add(324);
        array.add(5667);
        array.add(735624);
        array.add(8123);
        array.add(9324);

        //对集合进行遍历，使用方法size+get组合遍历
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }

    }
}
