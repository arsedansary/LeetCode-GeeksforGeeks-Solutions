//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        TreeMap<Integer,Integer>map=new TreeMap<>();
        int max=0;
        map.put(arr[0],0); // add first value to treemap
        for(int i=1;i<n;i++){
                if(map.floorKey(arr[i])==null){ //no value less than cur val exits in map
                    map.put(arr[i],i);
                }else{
                    int key=map.floorKey(arr[i]);
                    // traverse map, break if found cur key(as it would be last key with value less or eq to cur)
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        max=Math.max(max,i-entry.getValue());
                        if(entry.getKey()==key){
                            break; 
                        }
                    }
                    //dont need to add current number and index, as value less than arr[i] exits before
                }
        }
        return max;
        
        
    }
}
 