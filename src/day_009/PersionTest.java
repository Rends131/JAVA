package day_009;

public class PersionTest {
    public static void main(String[] args) {
        Persion p1=new Persion();
        Persion p2=new Persion();

        p1.setAge(18);
        p2.setAge(20);

        boolean b = p1.commpare(p2);
        System.out.println(b);
    }
}
