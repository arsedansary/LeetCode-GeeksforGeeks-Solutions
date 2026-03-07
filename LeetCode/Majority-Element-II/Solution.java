1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3
4        int n = nums.length; //size of the array
5        List<Integer> ls = new ArrayList<>(); // list of answers
6
7        //declaring a map:
8        HashMap<Integer, Integer> mpp = new HashMap<>();
9
10        // least occurrence of the majority element:
11        int mini = (int)(n / 3) + 1;
12
13        //storing the elements with its occurnce:
14        for (int i = 0; i < n; i++) {
15            int value = mpp.getOrDefault(nums[i], 0);
16            mpp.put(nums[i], value + 1);
17
18            //checking if nums[i] is
19            // the majority element:
20            if (mpp.get(nums[i]) == mini) {
21                ls.add(nums[i]);
22            }
23            if (ls.size() == 2) break;
24        }
25
26        return ls;
27    }
28}
29