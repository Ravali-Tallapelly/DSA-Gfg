class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++) {
            mp.put(arr[i],i);
        }
        for(int i=0;i<n;i++) {
            int temp=target-arr[i];
            if(mp.containsKey(temp) &&mp.get(temp)!=i) {
                return true;
            }
            
        }
        return false;
    }
}