package day_006;

public class DianFanGuoTest {
    public static void main(String[] args){
        DianFanGuo dfg=new DianFanGuo();

        dfg.brand="wow";
        dfg.color="READ";
        dfg.size=40;

        System.out.println(dfg.brand+" "+dfg.color+" "+dfg.size);

        Car c=new Car();;
        c.brand="BMW";
        c.color="black";
        c.paiLing=0.5;


        System.out.println(c.brand+" "+c.color+" "+c.paiLing);



        Student s=new Student();
        s.age=20;
        s.name="张三";
        s.sex="nan";

        System.out.println(s.name+" "+s.age+" "+s.sex);
    }


}

