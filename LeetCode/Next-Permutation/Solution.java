1class Solution {
2    public void nextPermutation(int[] nums) {
3        int ind1 = -1;
4        int ind2 = -1;
5
6        // Step 1: Find the first decreasing element from the end
7        for (int i = nums.length - 2; i >= 0; i--) {
8            if (nums[i] < nums[i + 1]) {
9                ind1 = i;
10                break;
11            }
12        }
13
14        // If no such element is found, reverse the whole array
15        if (ind1 == -1) {
16            reverse(nums, 0, nums.length - 1);
17        } else {
18            // Step 2: Find the element just greater than nums[ind1] to swap with
19            for (int i = nums.length - 1; i > ind1; i--) {
20                if (nums[i] > nums[ind1]) {
21                    ind2 = i;
22                    break;
23                }
24            }
25
26            swap(nums, ind1, ind2);
27
28            // Step 3: Reverse the subarray to the right of ind1
29            reverse(nums, ind1 + 1, nums.length - 1);
30        }
31    }
32
33    private void swap(int[] nums, int i, int j) {
34        int temp = nums[i];
35        nums[i] = nums[j];
36        nums[j] = temp;
37    }
38
39    private void reverse(int[] nums, int start, int end) {
40        while (start < end) {
41            swap(nums, start++, end--); // <-- fixed post-decrement
42        }
43    }
44}
45