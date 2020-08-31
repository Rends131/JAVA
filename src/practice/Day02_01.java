package practice;

import java.util.Scanner;

public class Day02_01 {
    public static void main(String[] args) {
        Day02_01 day = new Day02_01();
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = String.valueOf(sc.next());
        System.out.println(day.printString(str));
    }

    //传入字符串，去重后返回
    public String printString(String sty){
        StringBuffer strb = new StringBuffer();
        for (int i = 0; i <sty.length() ; i++) {
            char c = sty.charAt(i);
            int f = sty.indexOf(c);
            int l = sty.lastIndexOf(c);
            if (f == l || f == i){
                strb.append(c);
            }
        }
        return strb.toString();
    }

}
