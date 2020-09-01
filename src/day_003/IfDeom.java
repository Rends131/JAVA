package day_003;

public class IfDeom {
    public static void main(String[] atgs) {
        int i = 5;
        if (i > 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("1231231");
        System.out.println("----------------");
        int grade = 75;
        if (grade > 80) {
            System.out.println(grade + "优秀");
        } else if (grade > 70) {
            System.out.println(grade + "中");
        } else if (grade > 60) {
            System.out.println(grade + "查");
        }

    }
}
