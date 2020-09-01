package com.testfan.java.base;

public class ArrayTets {
    public static void main(String[] args) {
        String [] citys = {"北京","上海","广州","深圳"};
        //循环的高级用法
        for(String city:citys){
            System.out.println("城市名字是："+city);

        }
        for (int i = 0; i < citys.length; i++) {
            System.out.println("第"+i+"城市名字是："+citys[i]);
        }
    }

}
