package day_006;

public class Phonetest_1 {
    public static void main(String[] args){
        // new phone JVM在堆中开辟空间，P1=开辟空间的地址， 方法Phone中就带有参数，   左栈，右堆
        Phone p1 = new Phone();

        // 在方法栈中另开辟一个Phone空间，跟上面的不是同一个，方法中Phone中也有相同的参数，所有后面 p1是调用第一个Phone空间，p2调用第二个空间
        Phone p2 =new Phone();

        p1.color="read";
        p1.brand="iphone";
        p2.size=9.0;

        System.out.println(p1.color+" "+p1.brand+" "+p2.size+" "+p2.brand);
    }
}
