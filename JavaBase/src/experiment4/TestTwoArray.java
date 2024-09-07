package experiment4;

import java.util.Scanner;

public class TestTwoArray {
    static Scanner sc = new Scanner(System.in);
    static String[] course = {"Java 基础", "前端技术", "后端技术"};
    static String[] name = {"王云", "刘静涛", "南天华", "雷静"};
    // 存放学生各科成绩
    static int[][] stuScore = stuScore = new int[3][4];

    // 用 inputScore() 方法实现“输入所有学生的各科成绩”这一功能
    // 输入成绩
    public static void inputScore() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("请输入科目：" + course[i] + " 学生：" + name[j] + " 的成绩：");
                //读取学生成绩
                stuScore[i][j] = sc.nextInt();
            }
        }
    }

    // 用 eachAvgScore() 方法实现“计算各科的平均成绩”这一功能
    // 计算各科的平均成绩，将结果存储在singleSum数组中，并返回
    public static int[] eachAvgScore() {
        int[] singleSum = new int[]{0, 0, 0};
        // 计算各科的总分
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                singleSum[i] += stuScore[i][j];
            }
        }
        // 计算各科的平均成绩
        for (int i = 0; i < 3; i++) {
            System.out.println("科目：" + course[i] + "的平均成绩：" + singleSum[i] / 4.0);
        }
        return singleSum;
    }

    // 用 totalAvgScore() 实现“计算所有科目的平均成绩”这一功能
    public static void totalAvgScore(int[] singleSum) {
        int allScore = 0;
        // 对总成绩累加
        for (int i = 0; i < 3; i++) {
            allScore += singleSum[i];
        }
        System.out.println("总平均成绩:" + allScore / 12.0);
    }

    public static void main(String[] args) {
        // 输入成绩
        inputScore();
        // 计算各科的平均成绩
        int[] singleSum = eachAvgScore();
        // 计算全部科目的平均成绩
        totalAvgScore(singleSum);
    }
}
