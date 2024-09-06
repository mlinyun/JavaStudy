package experiment3;

public class TestFor4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {  // 循环20次
            for (int j = 1; j <= i; j++) {   // 每次输出当次个*
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
