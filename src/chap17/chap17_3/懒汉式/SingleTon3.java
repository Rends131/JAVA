package chap17.chap17_3.懒汉式;
/*
单例的三种写法：静态内部写法

 */
public class SingleTon3 {
    private SingleTon3(){}

    private static class Holder{
        static SingleTon3 instance=new SingleTon3();

    }

    public static SingleTon3 getInstance(){
        return Holder.instance;
    }
}
