package experiment3;

import java.util.Scanner;

public class TestWhile3 {
    public static void main(String[] args) {
        // 使用字符串 String 存储密码，后面课程会详细讲解 String 类
        String userPass = "";   // 用户输入的密码
        String PASSWORD = "123456"; // 正确密码
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("请输入程序密码：");
            userPass = sc.nextLine();   // 从控制台获取用户输入的密码
            System.out.println();
            //字符串的equals()方法用于判断两个字符串的值是否相同
        } while (!userPass.equals(PASSWORD));
        // 密码输入不正确，继续循环，重新输入
        System.out.println("程序密码正确，继续执行！");
    }
}
