package experiment3;

public class Flower {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int bai = i / 100;
            int shi = (i / 10) % 10;
            int ge = i % 10;
            int total = (int) (Math.pow(bai, 3) + Math.pow(shi, 3) + Math.pow(ge, 3));
            if (total == i) {
                System.out.print(i + " ");
            }
        }
    }
}
