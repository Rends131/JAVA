package demo05Arraylist;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三那封");
        list.add("黑崎䖊");
        list.add("名人");
        System.out.println(list);

        pringArrayList(list);
    }
    
    public static void pringArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if (i == list.size()-1){
                System.out.print(name+"}");
            }else {
                System.out.print(name+"@");
            }
        }
    }
}
 