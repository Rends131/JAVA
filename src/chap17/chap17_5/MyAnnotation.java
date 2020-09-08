package chap17.chap17_5;

public @interface MyAnnotation {
    //属性
    String name() default "帅";//给默认值
    int age()default 19;
}
