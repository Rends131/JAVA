package chap17.chap17_4;

public class Demo1 {
    public static void main(String[] args) {
        //枚举和switch语句使用
        Season season=Season.DONG;
        switch (season){
            case CHUN:
                System.out.println("春");
                break;
            case QIU:
                System.out.println("秋");
                break;
            case XIA:
                System.out.println("夏天");
                break;
            case DONG:
                System.out.println("冬天");
                break;
            default:
                break;
        }

    }
}
