package day_009.demo07;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
    public static void main(String[] args) {
        ArrayList<Student> array =new ArrayList<>();
        addStudent(array);
        pringStudnet(array);
        randomStudent(array);
    }

//    随机数生成学生信息
    public static void randomStudent(ArrayList<Student>array){
        Random r=new Random();
        int index = r.nextInt(array.size());
        Student s = array.get(index);
        System.out.println(s.getName());
    }



//    循环遍历
    public static void pringStudnet(ArrayList<Student>array){
        for (int i = 0; i <array.size() ; i++) {
            Student s =array.get(i);
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }

//    定义方法，存储到集合中
    public static void addStudent(ArrayList<Student> array){
        Student s1=new Student();
        s1.setName("一");
        s1.setAge(18);

        Student s2=new Student();
        s2.setName("二");
        s2.setAge(20);

        Student s3=new Student();
        s3.setName("三");
        s3.setAge(30);

        Student s4=new Student();
        s4.setName("四");
        s4.setAge(40);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

    }
}
