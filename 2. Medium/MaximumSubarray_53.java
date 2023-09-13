public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int localmax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            localmax = Math.max(localmax + nums[i], nums[i]);
            if (localmax > max) {
                max = localmax;
            }
        }

        return max;
        
    }
}   