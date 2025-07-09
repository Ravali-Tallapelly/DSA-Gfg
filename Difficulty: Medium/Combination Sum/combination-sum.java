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
            if(arr[i]>target) {
                continue;
            }
            path.add(arr[i]);
            func(i,res,arr,target-arr[i],path);
            path.remove(path.size()-1);
        }
    }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        // add your code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        func(0,res,arr,target,new ArrayList<>());
        return res;
    }
}