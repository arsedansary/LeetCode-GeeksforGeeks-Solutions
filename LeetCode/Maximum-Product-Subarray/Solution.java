1class Solution {
2    public int maxProduct(int[] nums) {
3        int prod1 = nums[0];
4        int prod2 = nums[0];
5        int result = nums[0];
6        
7        for (int i = 1; i < nums.length; i++) {
8            int temp = Math.max(nums[i], Math.max(prod1 * nums[i], prod2 * nums[i]));
9            prod2 = Math.min(nums[i], Math.min(prod1 * nums[i], prod2 * nums[i]));
10            prod1 = temp;
11            
12            result = Math.max(result, prod1);
13        }
14        
15        return result;
16    }
17}