class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0) {
                sum=0;
            }
        }
        return maxSum;
        
    }
}
