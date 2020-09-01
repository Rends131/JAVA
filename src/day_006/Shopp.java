package day_006;
/*
实现库存管理案例:
    1,存储商品信息
        创建出集合，存储商品类型变量
        将商品类型的变量，存储到集合中

 */
import java.util.ArrayList;
public class Shopp {
    public static void main(String[] args){

        ArrayList<Goods>array = new ArrayList<Goods>();
        addGoods(array);

    }
    /*
    定义方法，将商品的信息存储到集合中
    集合是所有方法的共享数据，参数传递
     */
    public static void addGoods(ArrayList<Goods>array){
        //创建商品类型变量 Goods类型的变量
        Goods g1 = new Goods();
        Goods g2 = new Goods();
        g1.brand="MacBook";
        g1.size=13.3;
        g1.price=9999.00;
        g1.count=3;

        g2.brand="HuaWei";
        g2.size=16.6;
        g2.price=8888.88;
        g2.count=1;
        array.add(g1);
        array.add(g2);


    }
}
