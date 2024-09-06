package experiment3;

import java.util.Scanner;

public class TestIf5 {
    public static void main(String[] args) {
        int score = -1; // 数学摸底考试
        int grade = 5;  // 学生年级数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数学摸底考试成绩：");
        score = sc.nextInt();   // 从控制台获取数学摸底考试成绩
        // 使用嵌套的 if 语句实现
        if (score >= 80) {
            System.out.print("请输入所属年级（只能输入“5”或“6”）：");
            grade = sc.nextInt();
            if (grade == 5) {
                System.out.println("你将参加市五年级组数学竞赛！");
            } else {
                System.out.println("你将参加市六年级组数学竞赛！");
            }
        } else {
            System.out.println("抱歉，不能参加市数学竞赛！");
        }
    }
}
