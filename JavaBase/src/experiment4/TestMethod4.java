package experiment4;

public class TestMethod4 {
    public static void main(String[] args) {
        // 在主方法中调用 方法并打印出来
        System.out.println(factorial(5));
    }

    // 求 n 的阶乘的方法
    public static long factorial(int n) {
        if (n == 1) {   // 判断条件，一旦满足就不再递归，逐层返回
            return 1;
        }
        long sum = factorial(n - 1);    // 递归调用
        return sum * n;     // 逐层返回求阶乘
    }
}
