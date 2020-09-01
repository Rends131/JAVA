package day_006;



import java.util.ArrayList;
import java.util.Random;
public class CallName {
    public static void main(String[] args){
        ArrayList<StudengName>array=new ArrayList<StudengName>();

        add(array);
        printArrayList(array);
        randomStudentName(array);

    }
    public static void randomStudentName(ArrayList<StudengName>array){
        Random r=new Random();
        int number = r.nextInt(array.size());
        //随机数，索引，到集合中get

        StudengName s=array.get(number);
        System.out.println(s.age+" "+s.name);
    }
    /*
            总览学生的信息，遍历集合
     */
    public static void printArrayList(ArrayList<StudengName>array){
        for(int i=0;i<array.size();i++){
            /*  存储集合的时候，结合.add(sn1)  sn1是StudentName类型遍历
                 获取的时候，集合,get方法，获取出来的是什么，还是StudentName类型变量
             */
            StudengName s= array.get(i);
            System.out.println(s.name+" "+s.age);
        }
    }
    /*
        定义方法，实现存储学生的姓名和年龄
        创建StudengName类型遍历，存储到集合中
     */

    public static void add(ArrayList<StudengName>array){
        StudengName sn1=new StudengName();
        System.out.println(sn1);
        StudengName sn2=new StudengName();
        StudengName sn3=new StudengName();
        StudengName sn4=new StudengName();
        StudengName sn5=new StudengName();

        sn1.name ="张三1";
        sn1.age=20;
        System.out.println(sn1);

        sn2.name ="张三2";
        sn2.age=202;

        sn3.name ="张三3";
        sn3.age=203;

        sn4.name ="张三4";
        sn4.age=204;

        sn5.name ="张三5";
        sn5.age=205;

        array.add(sn1);
        array.add(sn2);
        array.add(sn3);
        array.add(sn4);
        array.add(sn5);

    }
}
