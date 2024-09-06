package experiment3;

import java.util.Scanner;

public class TestFor3 {
    public static void main(String[] args) {
        int highNum = 0;    // 底薪大于或等于6000
        int sumBasSalary = 0;   // 高薪人员底薪总和
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入第" + (i + 1) + "个工程师底薪：");
            int basSalary = sc.nextInt();
            if (basSalary >= 6000) {
                highNum++;  // 高薪人员计数
                sumBasSalary += basSalary;  // 高薪人员底薪求和
            }
        }
        System.out.println("10个Java工程师中，高薪人员比例为：" + highNum / 10.0 * 100 + "%");
        System.out.println("高薪人员平均底薪为：" + sumBasSalary / highNum);
    }
}
