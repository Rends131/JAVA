package day_009;

public class Persion {
    private int age;
    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    public boolean commpare(Persion p){
        return this.age==p.age;
    }
}
