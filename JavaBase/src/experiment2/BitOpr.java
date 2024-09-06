package experiment2;

public class BitOpr {
    public static void main(String[] args) {
        // 二进制 10000001
        int a = 129;
        // 二进制 10000000
        int b = 128;
        // 按位与的结果为10000000
        System.out.println("a和b按位与的结果是：" + (a & b));

        // 按位或的结果为 10000001
        System.out.println("a和b按位或的结果是：" + (a | b));

        // Integer.toBinaryString()方法是将数据按二进制格式输出
        // 按位非的结果是：11111111111111111111111101111110
        System.out.println("a按位非的结果是：" + Integer.toBinaryString((~a)));

        // 按位异或的结果是00000001
        System.out.println("a和b按位异或的结果是：" + (a ^ b));

        int c = 5;
        // 用位运算方法计算出 5 * 8 的结果 5 * (2 ^ 3)
        int rst = c << 3;
        System.out.println("5左移三位的结果是：" + rst);
    }
}
