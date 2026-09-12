class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            int required=target-arr[i];
            if(seen.contains(required)) {
                return true;
            }
            seen.add(arr[i]);
        }
        return false;
    }
}