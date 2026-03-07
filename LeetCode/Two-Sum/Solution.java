1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3         int[] arr = new int[2];
4        for (int i = 0; i < nums.length - 1; i++) {
5            for (int j = i + 1; j < nums.length; j++) {
6                if (nums[i] + nums[j] == target) {
7                    arr[0] = i;
8                    arr[1] = j;
9                    return arr;
10                }
11            }
12        }
13        return arr;
14        
15    }
16}