package experiment3;

public class TestFor2 {
    public static void main(String[] args) {
        int sum = 0; // 存放奇数和
        // 循环从1开始，步长为2（奇数和），循环条件为 i <= 1000
        for (int i = 1; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println("1～1000之间所有奇数的和为：" + sum);
    }
}
