package day_005;


import java.util.Scanner;

public class Shopp {
    public static void main(String[] args){
        String[] brand={"MacBookAir","ThinkpdT450"};
        double[] size={13.3,15.6};
        double[] price={9998.97,6537.3};
        int[] count={0,0};
        while (true){
        int choose=chooseFunction();
        switch (choose){
            case 1:
                //调用查看库存清单方法
                printStore(brand,size,price,count);
            break;
            case 2:
                update(brand,count);
            break;
            case 3:
                return;

            default:
                System.out.println("没有功能");
            break;
        }}

    }
    /* 用户定义方法，修改商品库存
    * */
    public static void update(String[] brand,int[] count){
        //遍历数组，键盘接收库存数，存入 count[]数组
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<brand.length;i++){
            System.out.println("请输入"+brand[i]+"的库存数");
            //键盘输入，录入库存，存储到库存的数组中
            int newCount=sc.nextInt();
            count[i]=newCount;
        }
    }

    /*  定义方法，展示所有的库存清单，变量
    *
    *
    * */

    public static void printStore (String[] brand,double[] size,double[] price,int[] count){
        System.out.println("--------商品清单----------");
        System.out.println("商品型号   尺寸    加个     库存");
        //定义变量，计算库存总数
        int totalCount=0;
        int totalMoney=0;
        //遍历数组，将数组中所有产品信息打印出来
        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+size[i]+" "+price[i]+" "+count[i]);
            totalCount+=count[i];
            totalMoney+=count[i]*price[i];

 }
        System.out.println("总库存是"+totalCount);
        System.out.println("总价格是"+totalMoney);
    }


    /*  定义方法，实现用户的选择功能，功能的需要返回来
    *   返回值int
    *   参数，没有
    * */
    public static int chooseFunction(){
        System.out.println("-------库存管理--------");
        System.out.println("1，查看库存清单");
        System.out.println("2，修改商品库存数量");
        System.out.println("3，退出");
        System.out.println("请输入要执行的操作序号");

        Scanner sc=new Scanner(System.in);
        int chooseNumber=sc.nextInt();
        return chooseNumber;

    }
}
