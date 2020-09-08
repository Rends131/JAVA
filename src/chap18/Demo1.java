package chap18;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        //匿名内部类
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("线程启动了");
            }
        };

        //Lamda表达式
        Runnable runnable2=()-> System.out.println("线程2");

        new Thread(runnable).start();
        new Thread(runnable2).start();
        new Thread(()-> System.out.println("线程3")).start();

        /////////比较器
        //匿名内部类
        Comparator<String> com=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };

        //Lambda
        Comparator<String> com2=(String o1, String o2)->{
            return o1.length()-o2.length();
        };

        TreeSet<String> treeSet=new TreeSet<>(com);
    }
}
