package experiment4;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] nums = {12, 32, 13, 45, 34, 65, 76, 78, 89, 57};
        System.out.println("排序前的数据为:");
        for (int num1 : nums) {
            System.out.print(num1 + " ");
        }
        nums = insertionSort(nums);
        System.out.println("\n" + "排序后的数据为:");
        for (int num2 : nums) {
            System.out.print(num2 + " ");
        }
    }

    public static int[] insertionSort(int[] nums) {
        int index, temp;
        /*
            第 i 轮要把第 i 个元素放到前 i - 1 个有序的序列中
            默认数组的第一个元素为有序数列，所以循环变量 i 起始值为 1
        */
        for (int i = 1; i < nums.length; i++) {
            // 当前选择插入元素的前一位索引值
            index = i - 1;
            // 当前需要插入的元素
            temp = nums[i];
            while (index >= 0 && temp < nums[index]) {
                // 将前面大的元素后移一位，腾出位置
                nums[index + 1] = nums[index];
                index--;
            /*
                这一步很关键，这会使得当循环结束时，index 不在表示
                当前选择插入元素的前一位索引值，而是表示当前选择插入元素的前两位索引值
                所以此时 index + 1 才表示空出来的位置
            */
            }
            // 将要插入的元素插入到空出来的位置
            nums[index + 1] = temp;
        }
        return nums;
    }
}
