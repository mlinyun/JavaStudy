package experiment2;

public class ArithmeticOpr {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = (i2++); // ++ 在i2 之后，故先运算（赋值）在自增
        System.out.print("i = " + i);
        System.out.println(" i2 = " + i2);
        i = (++i2); // ++ 在 i2 前，故先自增在运算（赋值）
        System.out.print("i = " + i);
        System.out.println(" i2 = " + i2);
        i = (--i1); // -- 在 i1 前，故先自减在运算（赋值）
        System.out.print("i = " + i);
        System.out.println(" i1 = " + i1);
        i = (i1--); // -- 在 i1 后，故先运算（赋值）在自减
        System.out.print("i = " + i);
        System.out.println(" i1 = " + i1);

        System.out.println("10 % 3 = " + 10 % 3);
        System.out.println("20 % 3 = " + 20 % 3);

        int rst = (20 % 3) > 1 ? -10 : 10;
        System.out.println("(20 % 3) > 1 ? -10 : 10 = " + rst);
    }
}
