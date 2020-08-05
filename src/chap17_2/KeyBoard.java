package chap17_2;
/*
键盘
 */
public class KeyBoard implements Usb{
    @Override
    public void service() {
        System.out.println("键盘启动");
    }
}
