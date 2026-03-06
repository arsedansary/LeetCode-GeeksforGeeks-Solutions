1class Solution {
2   
3        public int[] twoSum(int[] nums, int target) {
4        Map<Integer, Integer> numToIndex = new HashMap<>();
5        for (int i = 0; i < nums.length; i++) {
6            if (numToIndex.containsKey(target - nums[i])) {
7                return new int[] {numToIndex.get(target - nums[i]), i};
8            }
9            numToIndex.put(nums[i], i);
10        }
11        return new int[] {};
12    }
13        
14    
15}