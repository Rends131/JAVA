package day_004;
/*          随机点名器：
            1，存储姓名
            2，预览所有人的姓名
            3，随机出一个人的姓名
*
* */
import java.util.Random;
public class CallName {
    public static void main(String[] args){
        String[] name={"1","2","3","4","5","a","b","v"};

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        System.out.println("================");

        //随机出一个数字，利用随机数，生产一个整数作为索引，找到数组对应元素,
        Random ran=new Random();
        int index=ran.nextInt(name.length);//index 就是随机数,生成随机数的范围在0-数组最大值

        System.out.println(name[index]);

    }
}
