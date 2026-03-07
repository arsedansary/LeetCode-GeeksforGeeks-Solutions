1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        // Result list to store the spiral order
4        List result = new ArrayList<>();
5
6        // Initialize boundaries
7        int top = 0;                        // Starting row
8        int bottom = matrix.length - 1;     // Ending row
9        int left = 0;                       // Starting column
10        int right = matrix[0].length - 1;   // Ending column
11
12        // Loop until all elements are traversed
13        while (top <= bottom && left <= right) {
14
15            // Traverse the top row from left to right
16            for (int i = left; i <= right; i++) {
17                result.add(matrix[top][i]);
18            }
19            top++; // Move the top boundary downward
20
21            // Traverse the right column from top to bottom
22            for (int i = top; i <= bottom; i++) {
23                result.add(matrix[i][right]);
24            }
25            right--; // Move the right boundary leftward
26
27    // Traverse the bottom row from right to left (only if rows remain)
28            if (top <= bottom) {
29                for (int i = right; i >= left; i--) {
30                    result.add(matrix[bottom][i]);
31                }
32                bottom--; // Move the bottom boundary upward
33            }
34
35   // Traverse the left column from bottom to top (only if columns remain)
36            if (left <= right) {
37                for (int i = bottom; i >= top; i--) {
38                    result.add(matrix[i][left]);
39                }
40                left++; // Move the left boundary rightward
41            }
42        }
43
44        // Return the spiral order result
45        return result;
46
47    }
48}