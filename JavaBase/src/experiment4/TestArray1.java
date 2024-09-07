package experiment4;

import java.util.Scanner;

public class TestArray1 {
    public static void main(String[] args) {
        // 底薪大于等于6000 的Java工程师人数
        int highNum = 0;
        // 高薪人员底薪总和
        int sumBasSalary = 0;
        // 创建一个长度为 10 的整型数组，用来保存10个Java工程师的底薪
        int[] basSalary = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "个工程师的底薪：");
            // 将用户输入的第i个工程师的底薪保存到数组中
            basSalary[i] = sc.nextInt();
            if (basSalary[i] >= 6000) {
                highNum++;  // 高薪人员计数
                sumBasSalary += basSalary[i];   // 高薪人员底薪总和
            }
        }

        System.out.println("10个Java工程师中，高薪人员比例为：" + highNum / 10.0 * 100 + "%");
        System.out.println("高薪人员平均底薪为：" + sumBasSalary / highNum);

        System.out.print("请输入你需要获取第几个工程师的底薪：");
        int index = sc.nextInt();
        System.out.println("第" + index + "个工程师的底薪为：" + basSalary[index - 1]);
    }
}
