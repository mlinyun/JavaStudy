package experiment1;

public class CodeStyle1 {
    // main 代码块与上层的 CodeStyle1 保持缩进
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("world");
        System.out.println("hello world");
        // if 代码块和上层的 main 保持缩进
        if (2 > 1) {
            System.out.println("hello");
            System.out.println("if");
            System.out.println("hello if");
        }
    }
}
