public class twoSum {
    public int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two numbers add up to the target sum.");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        twoSum solution = new twoSum();
        int[] result = solution.twosum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}