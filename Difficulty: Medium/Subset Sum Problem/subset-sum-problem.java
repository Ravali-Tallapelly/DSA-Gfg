class Solution {
    public static boolean func(int ind,int currSum,int[] arr,int sum) {
        if(currSum==sum) {
            return true;
        }
        if(ind==arr.length || currSum>sum) {
            return false;
        }
        for(int i=ind;i<arr.length;i++) {
            if(i>ind && arr[i]==arr[i-1]) {
                continue;
            }
            if(currSum+arr[i]>sum) {
                break;
            }
            if(func(i+1,currSum+arr[i],arr,sum)) {
                return true;
            }
        }
        return false;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        Arrays.sort(arr);
        return func(0,0,arr,sum);
    }
}
