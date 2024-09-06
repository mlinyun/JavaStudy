package experiment2;

import java.util.Scanner;

public class CalSalary {
    public static void main(String[] args) {
        // Java 工程师月薪
        double engSalary = 0.0;
        // 低薪
        int basSalary = 3000;
        // 月工资完成分数（最小值为0，最大值为150）
        int comResult = 100;
        // 月实际工作天数
        double workDay = 22;
        // 月应扣保险数
        double insurance = basSalary * 0.105;

        // 从控制台获取输入对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入Java工程师底薪：");
        // 从控制台获取输入—底薪，赋值给basSalary
        basSalary = sc.nextInt();

        System.out.print("请输入Java工程师月工作完成分数（最小值为0，最大值为150）：");
        // 从控制台获取输入—月工作完成分数，赋值给comResult
        comResult = sc.nextInt();

        System.out.print("请输入Java工程师月实际工作天数：");
        // 从控制台获取输入—月实际工作天数，赋值给workDay
        workDay = sc.nextDouble();

        System.out.print("请输入Java工程师月应扣保险数：");
        // 从控制台获取输入—月应扣保险数，赋值给insurance
        insurance = sc.nextDouble();

        // Java工程师月薪= 底薪 + 底薪×25%×月工作完成分数/100 + 15×月实际工作天数-月应扣保险数
        engSalary = basSalary + basSalary * 0.25 * comResult / 100 + 15 * workDay - insurance;
        System.out.println("Java工程师月薪为：" + engSalary);
    }
}
