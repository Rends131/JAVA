package chap17_2;
/*
工厂类
 */
public class UsbFactory {
    public static Usb creatrUsb(String type){//类型全名称com.qf
        Usb usb=null;
        Class<?> class1=null;
        try {
            class1 = Class.forName(type);
            usb=(Usb)class1.newInstance();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        if(type==1){//1是鼠标
//            usb=new Mouse();
//        }else if(type==2){//2是风扇
//            usb=new Fan();
//        }else if(type==3){//3是Upan
//            usb=new Upand();
//        }else if(type==4){
//            usb=new KeyBoard();
//        }
        return usb;
    }
}
