package day_006;
/*

  测试，刚定义好的phone类
 */

public class PhoneTest {
    public static void main(String[] args){

        Phone p= new Phone();

        //3:变量. 类型中的功能
        //变量 p.的方式，调用类中的属性
        //属性就是变量，赋值和获取
        p.color = "曜石黑";
        p.size = 6.0;
        p.brand="HUWAWEI";

        System.out.println(p.color+" "+p.brand+" "+p.size );
    }
}
