package experiment2;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        // 创建控制台输入对象
        Scanner sc = new Scanner(System.in);
        // 从控制台输入 byte 类型的数据
        byte byteNum = sc.nextByte();
        // 从控制台输入 short 类型的数据
        short shortNum = sc.nextShort();
        // 从控制台输入 int 类型的数据
        int intNum = sc.nextInt();
        // 从控制台输入 Long 类型的数据
        long longNum = sc.nextLong();
        // 从控制台输入 float 类型的数据
        float floatNum = sc.nextFloat();
        // 从控制台输入 double 类型的数据
        double doubleNum = sc.nextDouble();
        // 从控制台输入 boolean 类型的数据
        boolean booleanValue = sc.nextBoolean();
        // 从控制台输入 String 类型的数据
        String stringValue = sc.next();
        // 或者
        String stringValue2 = sc.nextLine();
    }
}
