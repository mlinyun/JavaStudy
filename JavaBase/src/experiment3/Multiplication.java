package experiment3;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("数" + num + "的乘法表为：");
        for (int i = 0, j = num; i <= num; i++, j--) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }
}
