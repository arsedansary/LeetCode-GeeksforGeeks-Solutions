1//3 Lines Code ,Space O(1) and Time O(rowIndex) solution
2class Solution {
3   public List<Integer> getRow(int rowIndex) {
4        List<Integer> ans = new ArrayList<>();                
5        long val=1;
6		
7        for(int j = 0; j <= rowIndex; j++){
8                ans.add((int)val );
9                val = (val * (rowIndex - j)) / (j + 1);
10            }
11			
12        return ans;
13    }
14}