package com.testfan.java.base;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();
        System.out.println(test.division(1,0));
    }


    public int division(int a,int b){
//        int c = a/b;
//        return c;
        int c=0;
        try{
            c=a/b;
        }catch (ArithmeticException e){
//            e.printStackTrace();//抛出异常
            System.out.println("分母为 0了，会报错");
        }finally {
            System.out.println("不管有没有异常都会执行这里");
        }
        return c;
    }

    public void writerTest(){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("D://aaa.txt",true));
            writer.write("heww");
            writer.newLine();
        }catch (Exception e){
            System.out.println("文件出错了");
        }finally {
//            try {
                if (writer != null){
//                    writer.close();
                }
//            }
        }
    }
}
