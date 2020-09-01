package day_003;
/*
* 1,导入包，Random，在java.util
* Random功能，产生随机数
* */

import java.util.Random;
public class RandomDemo {
    public static void main(String[] args){
        Random ran=new Random();

        int i=ran.nextInt(150);
        System.out.println(i);

        double d=ran.nextDouble();
        System.out.println(d);

        //生成5-26之间的随机数，包含26
        int randNum = ran.nextInt(22)+5;
        System.out.println(randNum);
        }

    }

