1class Solution {
2    public int majorityElement(int[] nums) {
3        
4        //size of the given array:
5        int n = nums.length;
6        for (int i = 0; i < n; i++) {
7            //selected element is v[i]
8            int cnt = 0;
9            for (int j = 0; j < n; j++) {
10                // counting the frequency of v[i]
11                if (nums[j] == nums[i]) {
12                    cnt++;
13                }
14            }
15
16            // check if frquency is greater than n/2:
17            if (cnt > (n / 2))
18                return nums[i];
19        }
20        return -1;
21    }
22}
23
24