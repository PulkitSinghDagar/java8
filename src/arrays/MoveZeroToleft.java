package arrays;

import java.util.Arrays;

class MoveZerosToLeft {
    public static void moveZerosToLeft(int[] nums) {
        int zeroIndex = nums.length - 1; // Start from the rightmost position

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                // Swap non-zero element with zeroIndex position
                int temp = nums[i];
                nums[i] = nums[zeroIndex];
                nums[zeroIndex] = temp;
                zeroIndex--; // Move zeroIndex leftward
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 0, 12};
        moveZerosToLeft(nums);
        System.out.println(Arrays.toString(nums)); // Output: [0, 0, 1, 3, 12]
    }
}

