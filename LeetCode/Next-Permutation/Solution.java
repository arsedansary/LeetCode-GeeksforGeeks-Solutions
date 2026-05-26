1class Solution {
2
3    public void nextPermutation(int[] nums) {
4        int ind1 = -1;
5        int ind2 = -1;
6
7        // Step 1: Find the first decreasing element from the end
8        for (int i = nums.length - 2; i >= 0; i--) {
9            if (nums[i] < nums[i + 1]) {
10                ind1 = i;
11                break;
12            }
13        }
14
15        // If no such element is found, reverse the whole array
16        if (ind1 == -1) {
17            reverse(nums, 0, nums.length - 1);
18        } else {
19            // Step 2: Find the element just greater than nums[ind1] to swap with
20            for (int i = nums.length - 1; i > ind1; i--) {
21                if (nums[i] > nums[ind1]) {
22                    ind2 = i;
23                    break;
24                }
25            }
26
27            swap(nums, ind1, ind2);
28
29            // Step 3: Reverse the subarray to the right of ind1
30            reverse(nums, ind1 + 1, nums.length - 1);
31        }
32    }
33
34    private void swap(int[] nums, int i, int j) {
35        int temp = nums[i];
36        nums[i] = nums[j];
37        nums[j] = temp;
38    }
39
40    private void reverse(int[] nums, int start, int end) {
41        while (start < end) {
42            swap(nums, start++, end--); // <-- fixed post-decrement
43        }
44    }
45}
46