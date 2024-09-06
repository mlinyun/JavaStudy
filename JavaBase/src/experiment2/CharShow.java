package experiment2;

public class CharShow {
    public static void main(String[] args) {
        char eChar = 'q';
        char cChar = '桥';
        System.out.println("显示汉字：" + cChar);
        char tChar = '\u0061';
        System.out.println("Unicode 代码 0061 代表的字符为：" + tChar);
        char fChar = '\t';
        System.out.println(fChar + "Unicode 代码 0061 代表的字符为：" + tChar);
    }
}
