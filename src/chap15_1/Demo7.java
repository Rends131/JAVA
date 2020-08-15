package chap15_1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
使用ObjectInputStream实现反序列化(读取重构成对象)

 */
public class Demo7 {
    public static void main(String[] args) throws Exception{
        //1创建对象流
        FileInputStream fis = new FileInputStream("d://sut.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //2读取文件
        Studnet s = (Studnet) ois.readObject();

        //3关闭
        ois.close();
        System.out.println("执行完毕");
        System.out.println(s.toString());
    }
}
