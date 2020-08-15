package chap15_1;

import java.io.Serializable;

public class Studnet implements Serializable{
    private String name;
    private int age;

    public Studnet(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Studnet(String name, int age){

        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Student [name ="+name+",age= "+ age +"]";
    }
}
