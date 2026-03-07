1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3         int n = nums.length; //size of the array
4
5        int cnt1 = 0, cnt2 = 0; // counts
6        int el1 = Integer.MIN_VALUE; // element 1
7        int el2 = Integer.MIN_VALUE; // element 2
8
9        // applying the Extended Boyer Moore's Voting Algorithm:
10        for (int i = 0; i < n; i++) {
11            if (cnt1 == 0 && el2 != nums[i]) {
12                cnt1 = 1;
13                el1 = nums[i];
14            } else if (cnt2 == 0 && el1 != nums[i]) {
15                cnt2 = 1;
16                el2 = nums[i];
17            } else if (nums[i] == el1) cnt1++;
18            else if (nums[i] == el2) cnt2++;
19            else {
20                cnt1--; cnt2--;
21            }
22        }
23
24        List<Integer> ls = new ArrayList<>(); // list of answers
25
26        // Manually check if the stored elements in
27        // el1 and el2 are the majority elements:
28        cnt1 = 0; cnt2 = 0;
29        for (int i = 0; i < n; i++) {
30            if (nums[i] == el1) cnt1++;
31            if (nums[i] == el2) cnt2++;
32        }
33
34        int mini = (int)(n / 3) + 1;
35        if (cnt1 >= mini) ls.add(el1);
36        if (cnt2 >= mini) ls.add(el2);
37
38        // Uncomment the following line
39        // if it is told to sort the answer array:
40        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);
41
42        return ls;
43    
44        
45    }
46}