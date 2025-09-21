class Solution:
    def maxSubarraySum(self, arr, k):
        n=len(arr)
        maxSum=0
        for i in range(k):
            maxSum+=arr[i]
        currSum=maxSum
        for i in range(k,n):
            currSum=currSum+arr[i]-arr[i-k]
            maxSum=max(maxSum,currSum)
        return maxSum
        
            