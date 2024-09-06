package experiment3;

import java.util.Scanner;

public class TestIf1 {
    public static void main(String[] args) {
        int javaScore = -1; // 定义变量 javaScore，用来保存 Java考试成绩
        Scanner sc = new Scanner(System.in);    // 创建控制台输入对象
        System.out.print("请输入王云同学的Java考试成绩：");   // 打印提示信息
        javaScore = sc.nextInt();   // 从控制台中获取Java考试成绩
        sc.close();
        // 使用 (表达式1) ? (表达式2) : (表达式3) 三目运算符判断输出
        String result = javaScore >= 60 ? "恭喜你，考试合格" : "很难过的通知你，考试不及格，需要补考！";
        System.out.println(result);
    }
}
