package experiment3;

import java.util.Scanner;

public class TestSwitch1 {
    public static void main(String[] args) {
        int score = -1; // 美术学习班结业评价
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入张明美术学习班结业评价（只能输入1、2、3、4）：");
        score = sc.nextInt();   // 从控制台获取张明美术学习班结业评价
        switch (score) {
            case 1:
                System.out.println("暑假带张明去九寨沟旅游！");
                break;
            case 2:
                System.out.println("奖励一个变形金刚！");
                break;
            case 3:
                System.out.println("不奖不罚，需要继续努力！");
                break;
            case 4:
                System.out.println("负责家里洗碗一周！");
                break;
            default:
                System.out.println("输入错误，请重新输入！");
                break;
        }
    }
}
