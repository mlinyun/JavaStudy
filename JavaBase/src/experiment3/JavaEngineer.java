package experiment3;

import java.util.Scanner;

public class JavaEngineer {
    public static void main(String[] args) {
        // Java 工程师月薪
        double engSalary = 0.0;
        // 底薪
        int basSalary;
        // 月工作完成分数（最小值为0，最大值为150）
        int comResult;
        // 月实际工作天数
        int workDay;
        // 月应扣保险数
        double insurance;
        // 从控制台获取输入的对象
        Scanner sc = new Scanner(System.in);
        // 用户选择的数
        int userSel = -1;
        // 使用while(true)，在单个模块功能执行结束后，重新输出主界面，继续循环
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("|                蓝桥 Java 工程师管理系统             |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("1. 输入Java工程师资料");
            System.out.println("2. 删除指定Java工程师资料");
            System.out.println("3. 查询Java工程师资料");
            System.out.println("4. 修改Java工程师资料");
            System.out.println("5. 计算Java工程师的月薪");
            System.out.println("6. 保存新添加的工程师资料");
            System.out.println("7. 对Java工程师信息排序");
            System.out.println("8. 输出所有Java工程师信息");
            System.out.println("9. 清空所有Java工程师数据");
            System.out.println("10. 打印Java工程师数据报表");
            System.out.println("11. 从文件重新导入Java工程师数据");
            System.out.println("0. 结束（编辑工程师信息后提示保存）");

            // 获取终端输入的模块编号，使用 switch 语句进行匹配相应的模块，打印其功能信息。
            System.out.print("请输入您的选择：");
            userSel = sc.nextInt();
            switch (userSel) {
                case 1:
                    System.out.println("本模块功能未实现");
                    break;
                case 2:
                    System.out.println("本模块功能未实现");
                    break;
                case 3:
                    System.out.println("本模块功能未实现");
                    break;
                case 4:
                    System.out.println("本模块功能未实现");
                    break;
                case 5:
                    System.out.print("请输入Java工程师底薪：");
                    basSalary = sc.nextInt();
                    System.out.print("请输入Java工程师月完成分数（最小值为0，最大值为150）：");
                    comResult = sc.nextInt();
                    System.out.print("请输入Java工程师实际工作天数：");
                    workDay = sc.nextInt();
                    System.out.print("请输入Java工程师应扣保险数：");
                    insurance = sc.nextDouble();
                    engSalary = basSalary + basSalary * 0.25 * comResult / 100 + 15 * workDay - insurance;
                    System.out.println("Java工程师月薪为：" + engSalary);
                    break;
                case 6:
                    System.out.println("本模块功能未实现");
                    break;
                case 7:
                    System.out.println("本模块功能未实现");
                    break;
                case 8:
                    System.out.println("本模块功能未实现");
                    break;
                case 9:
                    System.out.println("本模块功能未实现");
                    break;
                case 10:
                    System.out.println("本模块功能未实现");
                    break;
                case 11:
                    System.out.println("本模块功能未实现");
                    break;
                case 0:
                    System.out.println("程序结束！");
                    break;
                default:
                    System.out.println("输入数据不正确！");
                    break;
            }

            if (userSel == 0) {
                // 当用户输入0时，退出while循环，结束程序
                break;
            }
        }
    }
}
