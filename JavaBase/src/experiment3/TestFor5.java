package experiment3;

public class TestFor5 {
    public static void main(String[] args) {
        // 输出 1~100 之间所有质数
        outer:
        for (int i = 2; i <= 100; i++) {    // 从2开始逐个进行判断
            // Math.sqrt(i) 方法是求 i 的平方根
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {   // 外循环数除以内循环数，余0则非质数，跳出内循环
                    continue outer; // 跳出内循环，跳到outer标识的位置继续循环
                }
            }
            System.out.print(i + " ");    // 否则显示质数
        }
    }
}
