// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    public static void func(int ind,ArrayList<ArrayList<Integer>> res,int[] arr,int target,ArrayList<Integer> path) {
        if(target==0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=ind;i<arr.length;i++) {
            if(i>ind && arr[i]==arr[i-1]) {
                continue;
            }
            if(target<arr[i]) {
                break;
            }
            path.add(arr[i]);
            func(i+1,res,arr,target-arr[i],path);
            path.remove(path.size()-1);
        }
    }
    static ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // add your code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        func(0,res,arr,target,new ArrayList<>());
        return res;
        
    }
}

