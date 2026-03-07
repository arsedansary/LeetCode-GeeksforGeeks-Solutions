//Multiple Approach breakdown Approach 2

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) numsSet.add(num);
        
        int longest = 0;
        for (int num : numsSet) {
            if (!numsSet.contains(num - 1)) { // Start of a sequence
                int current = num;
                int length = 1;
                while (numsSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}