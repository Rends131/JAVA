package chap17_2;

public class Upand implements Usb {
    @Override
    public void service() {
        System.out.println("U盘开始工作了");
    }
}
