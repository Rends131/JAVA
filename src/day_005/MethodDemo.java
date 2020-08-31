package day_005;

public class MethodDemo {
    public static void main(String[] args){
        int area=gatArea(5,6);
        System.out.println(area);

    }
    /*      要求：计算一个长方形面积
    *       定义方法解决这个要求
    *       分析方法定义过程
    *           1，明确方法计算后的结果的数据类型int，定义格式就是对应的返回值类型
    *           2，
    * */
    public static int gatArea(int w,int h){
        // c=w*h;
        // return c;
        //简单方法
        return w*h;
    }
}
