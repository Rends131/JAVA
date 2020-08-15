package chap15_1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
使用ObjectOutputStream实现对象的序列号
要求：序列化的类必须要实现Serializable接口
 */
public class Demo6 {
    public static void main(String[] args) throws Exception{
        //1创建对象流
        FileOutputStream fos = new FileOutputStream("d://sut.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //2序列化（写入操作）
        Studnet zhangsan=new Studnet("张三",20);
        oos.writeObject(zhangsan);
        //3关闭
        oos.close();
        System.out.println("序列化完毕");
    }
}
