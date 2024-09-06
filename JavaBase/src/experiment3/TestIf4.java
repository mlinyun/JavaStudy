package experiment3;

import java.util.Scanner;

public class TestIf4 {
    public static void main(String[] args) {
        int javaScore = -1;  // Java考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入王云同学Java考试成绩：");
        javaScore = sc.nextInt(); // 从控制台获取Java考试成绩
        // 使用if...else if...实现
        if (javaScore >= 85) {
            System.out.println("恭喜你，成绩优秀！");
        } else if (javaScore >= 70) {
            System.out.println("恭喜你，成绩良好！");
        } else if (javaScore >= 60) {
            System.out.println("恭喜你，成绩合格！");
        } else {
            System.out.println("很抱歉，成绩不合格！");
        }
    }
}
