class Solution {
    public void sortColors(int[] nums) {
    int lo = 0;
    int cur = 0;
    int hi = nums.length - 1;

    while (cur <= hi) {
        if (nums[cur] == 0) {
            // Swap nums[lo] and nums[cur]
            int temp = nums[lo];
            nums[lo] = nums[cur];
            nums[cur] = temp;
            lo++;
            cur++;
        } else if (nums[cur] == 2) {
            // Swap nums[hi] and nums[cur]
            int temp = nums[hi];
            nums[hi] = nums[cur];
            nums[cur] = temp;
            hi--;
        } else {
            cur++;
        }
    }

    }
}