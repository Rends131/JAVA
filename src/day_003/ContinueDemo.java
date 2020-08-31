package day_003;
/*
* continue 在循环中，终止本次循环，开始下一次循环
* */
public class ContinueDemo {
    public static void main(String[] args){
        // 循环打印10次，如果i取余为0，则跳出循环
        for(int i=0;i<10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
