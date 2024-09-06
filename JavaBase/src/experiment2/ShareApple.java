package experiment2;

import java.util.Scanner;

public class ShareApple {
    public static void main(String[] args) {
        int appleNum = 0;   // 苹果数
        int stuNum = -1;    // 小朋友
        double stuApple = -1;   // 每个小朋友得到多少个苹果

        // 从控制台中获取输入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入篮子里有几个苹果：");
        appleNum = sc.nextInt();

        System.out.println("请输入屋子里有几个小朋友：");
        stuNum = sc.nextInt();

        // 计算每个小朋友得到的苹果数
        stuApple = appleNum / stuNum;
        System.out.println("每个小朋友得到：" + stuApple + "个苹果");
    }
}
