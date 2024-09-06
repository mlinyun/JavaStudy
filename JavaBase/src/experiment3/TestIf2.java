package experiment3;

import java.util.Scanner;

public class TestIf2 {
    public static void main(String[] args) {
        int javaScore = -1; // 定义变量 javaScore，用来保存 Java考试成绩
        Scanner sc = new Scanner(System.in);    // 创建控制台输入对象
        System.out.print("请输入王云同学的Java考试成绩：");   // 打印提示信息
        javaScore = sc.nextInt();   // 从控制台中获取Java考试成绩
        sc.close();
        // 使用 if...else... 实现
        if (javaScore >= 60) {
            System.out.println("恭喜你，考试合格");
        } else {
            System.out.println("很难过的通知你，考试不及格，需要补考！");
        }
    }
}
