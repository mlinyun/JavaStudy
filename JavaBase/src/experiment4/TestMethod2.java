package experiment4;

public class TestMethod2 {
    public static void main(String[] args) {
        drawStar(5);    // 调用drawStar方法，实参为5，表示行数
        drawStar(8);    // 调用drawStar方法，实参为8，表示行数
        drawStar(12);   // 调用drawStar方法，实参为12，表示行数
    }

    // 定义一个方法：输出一个图形，共x行，每行输出的*的个数与行数相等
    public static void drawStar(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
