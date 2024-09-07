package experiment4;

public class TestMethod1 {
    public static void main(String[] args) {
        // 输出第一个图形，5行*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 输出第二个图形，8行*
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 输出第三个图形，12行*
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
