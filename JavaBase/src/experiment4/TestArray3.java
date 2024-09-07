package experiment4;

import java.util.Scanner;

public class TestArray3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 创建一个长度为10的整型数组，存放工程师底薪
        int[] basSalary = new int[10];
        // 调用 inputEngSalary() 方法输入工程师底薪并执行加薪操作
        inputEngSalary(basSalary);  // 传递引用

        System.out.println("请输入你需要获取第几个工程师加薪后的底薪：");
        int index = sc.nextInt();
        System.out.println("第" + (index + 1) + "个工程师加薪后的底薪为：" + basSalary[index - 1]);
    }

    public static void inputEngSalary(int[] basSalary) {
        for (int i = 0; i < basSalary.length; i++) {
            System.out.print("请输入第" + (i + 1) + "工程师底薪：");
            basSalary[i] = sc.nextInt();
            if (basSalary[i] >= 6000) {
                // 高薪人员加薪5%
                basSalary[i] = (int) (basSalary[i] * (1 + 0.05));
            } else {
                // 非高薪人员加薪10%
                basSalary[i] = (int) (basSalary[i] * (1 + 0.1));
            }
        }
    }
}
