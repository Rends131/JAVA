package com.testfan.java.base;

public class LogicTest {
    public static void main(String[] args) {
        LogicTest t = new LogicTest();
        t.work("下雨");

    }

    public void work(String weather){
        System.out.println("出门");
        if(weather.equals("下雨")){
            System.out.println("带伞");
        }
        System.out.println("出门");
    }
}

