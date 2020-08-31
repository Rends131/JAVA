package day_005;

import java.util.Random;

public class CallName {
    public static void main(String[] args){
        //定义数组，存储学生姓名
        String[] name=new String[8];
        //调用添加姓名方法
        addStudent(name);
        //调用遍历数组方法
        printStudentName(name);
        //调用随机姓名方法
        String names = randomStudentName(name);
        System.out.println(names);

    }
    // 随机数做索引，数组中找到学生姓名
    public static String randomStudentName(String[] name){
        Random ran=new Random();
        int index=ran.nextInt(name.length);
        System.out.println(index);
        return name[index];
    }

    public static void printStudentName(String[] name){
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }

    public static void addStudent(String[] name){
        name[0]="张";
        name[1]="网";
        name[2]="李";
        name[3]="钱";
        name[4]="周";
        name[5]="吴";
        name[6]="正";
        name[7]="叶";
    }
}
