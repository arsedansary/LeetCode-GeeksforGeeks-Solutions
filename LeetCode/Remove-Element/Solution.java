1class Solution {
2   public int removeElement(int[] nums, int val) {
3int start=0;
4for(int i=0;i<nums.length;i++)
5{
6if(nums[i]!=val)
7{
8nums[start]=nums[i];
9start++;
10}
11}
12return start;
13
14}
15}