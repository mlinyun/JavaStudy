package experiment2;

public class VarScope {
    // 成员变量，其作用域从变量定义位置起至类结束
    static float varQ = 9.1F;

    /*
        此处的 method() 和 main() 都是方法，区别是 method() 不是程序的入口
        读者暂时只需要将本 method() 理解为一个类似 main() 的方法而已，暂时不用深究
    */
    public static void method() {
        // 方法中的局部变量，其作用域从变量定义位置起至语句块结束
        int varB = 10;
        // 可以使用本方法中的局部变量 varB
        System.out.println("varB = " + varB);
        // 可以使用成员变量 varQ
        System.out.println("varQ = " + varQ);
        // 在本类(VarScope)中的方法内访问静态成员变量，可以直接写静态成员变量名
        // 若在其他类中需要访问本类(VarScope)中的静态成员变量，需要使用 类名.静态成员变量名 的形式进行访问
        // eg: System.out.println("varQ = " + VarScope.varQ);
    }

    public static void main(String[] args) {
        // 方法中的局部变量，其作用域从变量定义位置起至语句块结束

        int varL = 8;
        // 可以使用本方法中的局部变量 varL
        System.out.println("varL = " + varL);
        // 可以使用成员变量 varQ
        System.out.println("varQ = " + varQ);
        // 不可以使用其他方法中的局部变量
        // eg：不可以使用 method() 方法中的 varB
        // System.out.println("varB = " + varB);   // 会报错
    }
}
