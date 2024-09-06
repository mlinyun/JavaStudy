package experiment3;

import java.util.Scanner;

public class TestIf3 {
    public static void main(String[] args) {
        int javaScore = -1; // Java 考试成绩
        int webScore = -1;  // Web 考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入王云同学Java考试成绩：");
        javaScore = sc.nextInt(); //从控制台获取Java考试成绩
        System.out.print("请输入王云同学Web考试成绩：");
        webScore = sc.nextInt(); //从控制台获取Web考试成绩
        // 使用if...else...实现
        if (javaScore >= 60 && webScore >= 60) {
            System.out.println("恭喜你，获得Java初级工程师认证！");
        } else {
            System.out.println("你有考试不及格，需要补考！");
        }
    }
}
