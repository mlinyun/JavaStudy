package experiment3;

import java.util.Scanner;

public class TestWhile2 {
    public static void main(String[] args) {
        int userSel = -1;   // 用户选择输入的参数
        while (true) {  // 使用while(true)，在单个模块功能执行结束后，重新输出主界面，继续循环
            System.out.println("1. 输入数据");
            System.out.println("2. 输出数据");
            System.out.println("3. 退出程序");
            System.out.print("请选择你的输入（只能输入1、2、3）：");
            Scanner sc = new Scanner(System.in);
            userSel = sc.nextInt();    // 从控制台获取用户输入的选择
            switch (userSel) {
                case 1:
                    System.out.println("执行1.输入数据模块");
                    System.out.println("******************");
                    System.out.println("******************");
                    break;
                case 2:
                    System.out.println("执行2.输出数据模块");
                    System.out.println("******************");
                    System.out.println("******************");
                    break;
                case 3:
                    System.out.println("结束程序！");
                    break;
                default:
                    System.out.println("输入数据不正确！");
                    break;
            }

            if (userSel == 3) {
                // 当用户输入3时，退出while循环，结束程序
                break;
            }
        }
    }
}
