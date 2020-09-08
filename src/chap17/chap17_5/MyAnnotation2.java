package chap17.chap17_5;

import chap17.chap17_4.Gender;

import java.util.ArrayList;

public @interface MyAnnotation2 {
    //属性
    //字符串类型
    String value();
    //基本类型
    int num()default 20;
    //Class类型
    Class<?>class1();
    //枚举类型
    Gender gender();
    //注解类型
    MyAnnotation annotation();

//    ArrayList<String> list();


}
