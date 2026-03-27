import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int N = 0; N < numRows; N++) {
            List<Integer> row = new ArrayList<>();
            long x = 1; // use long to avoid overflow during calculation

            for (int R = 0; R <= N; R++) {
                row.add((int) x);
                // The mathematical formula:
                x = x * (N - R) / (R + 1);
            }

            triangle.add(row);
        }

        return triangle;
    }
}