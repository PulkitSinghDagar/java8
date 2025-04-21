package arrays;




class FindAndInsertThePlace {
    public int searchInsertPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        FindAndInsertThePlace solution = new FindAndInsertThePlace();
        int[] nums = {1, 3, 5, 7, 9};

        System.out.println(solution.searchInsertPosition(nums, 5));

        System.out.println(solution.searchInsertPosition(nums, 11)); }
}
