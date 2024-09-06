package experiment2;

public class TestConvert {
    public static void main(String[] args) {
        int i1 = 222;
        int i2 = 333;
        // 系统将 i1，i2 转换为 double 型运算
        double d1 = (i1 + i2) * 2.9;
        // 从 double 类型转换成 float 型，需要进行强制转换
        float f1 = (float) ((i1 + i2) * 2.9);
        System.out.println(d1);
        System.out.println(f1);

        byte b1 = 88;
        byte b2 = 99;
        // 系统先将b1，b2转换为 int 型，因此将结果赋值给 byte 型需要进行强制类型转换
        byte b3 = (byte) (b1 + b2);
        // 强制类型转换，数据结果溢出
        System.out.println("88 + 99 = " + b3);

        double d2 = 5.1E88;
        // 从 double 型强制转换成 float 型，结果溢出
        float f2 = (float) d2;
        System.out.println(f2);

        float f3 = 3.14F;
        // 这条语句不能写成 f3 = f3 + 0.05;, 否则会报错，因为0.05 是 double 型
        // 即使加上了 f3，仍然是 double 类型，赋值给 float 会报错
        // 所以这里 0.05 要加上 F或者f，表示是一个单精度浮点数
        f3 = f3 + 0.05F;
        System.out.println("3.14F + 0.05F = " + f3);
    }
}
