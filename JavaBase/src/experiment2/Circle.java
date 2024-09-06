package experiment2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // 定义 PI 常量
        final double PI = 3.14159265358979323846;
        // 创建控制台输入对象
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        // 从控制台获取圆的半径
        double radius = sc.nextDouble();
        // 计算圆的面积
        double area = PI * radius * radius;
        // 打印输出圆的面积
        System.out.println("圆的面积为：" + area);
    }
}
