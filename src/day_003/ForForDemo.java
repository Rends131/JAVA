package day_003;
/*
*       for(){
*           for(){
*           }
*       }
*   总的循环次数=内循环次数 * 外循环次数
*
*   外循环控制的是行数
*   内循环控制的是每行的个数
* */
public class ForForDemo {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=0;j<3;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
