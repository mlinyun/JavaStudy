package experiment4;

public class Yh_tangle {
    // 实现输入等腰杨辉三角形的方法
    public static void yh(int n) {
        int yh[][] = new int[n][]; // 定义二维数组，必须设置一维数组长度
        int sum = 0;    // 总和

        // 遍历二维数组
        for (int i = 0; i < n; i++) {
            yh[i] = new int[i + 1]; // 申请空间，第i行有i+1个数
            for (int j = 0; j < n - i - 1; j++) {   // 打印等腰三角形前面的空格
                System.out.print("  ");   // 两个空格
            }
            // 遍历一维数组
            for (int k = 0; k < i + 1; k++) {
                // 行首行末为1
                if (k == 0 || k == yh[i].length - 1) {
                    yh[i][k] = 1;
                } else {
                    // 当前一维数组的索引 k 元素的值，等于前一个数组索引
                    yh[i][k] = yh[i - 1][k - 1] + yh[i - 1][k];
                }
                // 格式化输出元素的值
                System.out.printf("%4s", yh[i][k] + " ");
                sum += yh[i][k];
            }
            // 换行
            System.out.println();
        }
        // 输出总和
        System.out.println("\n" + "前十行和为：" + sum);
    }

    public static void main(String[] args) {
        // 调用 yh() 方法并传入参数（需要输出的行数）
        yh(10);
    }
}
