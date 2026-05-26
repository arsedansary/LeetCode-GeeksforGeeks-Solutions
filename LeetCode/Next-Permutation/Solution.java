1import java.util.*;
2class Solution {
3    public void nextPermutation(int[] nums) {
4        int n = nums.length;
5        int i = n - 2;
6        // Step 1: find first decreasing element from right
7        while (i >= 0 && nums[i] >= nums[i + 1]) {
8            i--;
9        }
10        // Step 2: if not found, reverse whole array
11        if (i < 0) {
12            reverse(nums, 0, n - 1);
13            return;
14        }
15        // Step 3: find element just larger than nums[i]
16        int j = n - 1;
17        while (nums[j] <= nums[i]) {
18            j--;
19        }
20        // Step 4: swap
21        swap(nums, i, j);
22        // Step 5: reverse remaining suffix
23        reverse(nums, i + 1, n - 1);
24    }
25    private void swap(int[] nums, int i, int j) {
26        int temp = nums[i];
27        nums[i] = nums[j];
28        nums[j] = temp;
29    }
30    private void reverse(int[] nums, int start, int end) {
31        while (start < end) {
32            swap(nums, start++, end--);
33        }
34    }
35}