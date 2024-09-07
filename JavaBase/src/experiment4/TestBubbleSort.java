package experiment4;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] nums = {12, 32, 13, 45, 34, 65, 76, 78, 89, 57};
        System.out.println("排序前的数据为:");
        for (int num1 : nums) {
            System.out.print(num1 + " ");
        }
        bubbleSort(nums);
        System.out.println("\n" + "排序后的数据为:");
        for (int num2 : nums) {
            System.out.print(num2 + " ");
        }
    }

    public static void bubbleSort(int[] nums) {
        // 需要比较 nums.length - 1 轮
        for (int i = 0; i < nums.length - 1; i++) {
            // 根据 nums.length - i - 1,每轮需要比较的次数逐轮减少一次
            for (int j = 0; j < nums.length - i - 1; j++) {
                // 相邻数进行比较，符合条件进行替换
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
