//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

// Position this line where user code will be pasted.

// Driver class with main function
class GFG {
    // Main function
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());

        // Iterating over testcases
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int arr[] = new int[n];

            String s[]=in.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            System.out.println(obj.LargButMinFreq(arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// Helper class to find largest number with minimum frequency
class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        HashMap<Integer, Integer>hm = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int minFreq=Integer.MAX_VALUE, key=0;
        for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
            
            if(entry.getValue()==minFreq && entry.getKey()>key){
                    key=entry.getKey();
            }
            if(entry.getValue()<minFreq){
                key=entry.getKey();
                minFreq = entry.getValue();
            }
        }
        return key;
    }
}