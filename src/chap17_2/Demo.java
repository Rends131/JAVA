package chap17_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/*
客户程序
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("=========请选择：1鼠标，2风扇，3upan，4键盘==========");
        Scanner sc= new Scanner(System.in);
        String choice = sc.next();
        //1 = chap17_2.Mousr
        //2 = chap17_2.Fan
        //3 = chap17_2.Upan
        //4 = chap17_2.keyBoard
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("src\\chap17_2\\usb.properties");
        properties.load(fis);
        fis.close();

        Usb usb=UsbFactory.creatrUsb(properties.getProperty(choice));

        if(usb!=null){
            System.out.println("购买成功");
            usb.service();
        }else {
            System.out.println("购买失败");
        }
    }
}
