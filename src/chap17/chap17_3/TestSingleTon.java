package chap17.chap17_3;

import chap17.chap17_3.懒汉式.SingleTon3;

/*
三个线程拿到的都是一个对象
饿汉试
 */
public class TestSingleTon {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SingleTon3.getInstance().hashCode());
                }
            }).start();
        }
    }
}
