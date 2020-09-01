package practice;

import java.util.Scanner;

public class Day02_02 {
    public static void main(String[] args) {
        Day02_02 day0202 = new Day02_02();
        System.out.println("请输入刷卡次数");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println("本月坐地铁：" + day0202.day(day) + "天，共" + day + "次，金额是：" + day0202.money(day));
    }

    //输入次数，先计算累计消费金额，在根据
    public int money(int num) {
        int money;
        money = 6 * num;
        //计算大概到100元需要刷卡17次,102元
        int nums = num-17;
        if (money <= 100) {
            return money;
        } else if (money > 100 && money <= 150) {
            System.out.println("累计消费大于100小于150，每次的刷卡费用打8折");
            int a = (int) (nums * (6 * 0.8));
            money=a+102;
            System.out.println("前17次刷卡金额102，后面剩余"+nums+"次打8折，打折后消费"+a+"总价为："+money);
            return money;
        } else if (money > 150 && money < 300) {
            System.out.println("累计消费大于等于150，小于300，每次的刷卡费用打5折");
            int a = (int) (nums * (6 * 0.5));
            money=a+102;
            System.out.println("前17次刷卡金额102，后面剩余"+nums+"次打5折，打折后消费"+a+"总价为："+money);
            return money;
        } else if (money >= 300) {
            money = 6 * nums + 102;
            return money;
        }
        return money;
    }

    //输入次数，计算天
    public int day(int num) {
        int day = 0;
        if (num % 2 == 0) {
            day = num / 2;
            return day;
        } else {
            day = num / 2 + 1;
            return day;
        }
    }
}
