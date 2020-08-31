package day_003;
import java.util.Scanner;
import java.util.Random;
public class GameDemo {
    public static void main(String[] args){
        System.out.println("请输入1-100数字，猜对");

        //随机数字，1-100
        Random ran=new Random();
        int ranNumber = ran.nextInt(100)+1;

        //键盘接收输入
        Scanner sc = new Scanner(System.in);

        while (true){
            int number = sc.nextInt();
            if(number>ranNumber){
                System.out.println("猜大了");
            }else if(number<ranNumber){
                System.out.println("猜小了");
            }else {
                System.out.println("正确");
                break;
            }
        }
    }
}
