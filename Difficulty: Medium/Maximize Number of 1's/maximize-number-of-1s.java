// User function Template for Java

class Solution {
    public int maxOnes(int arr[], int k) {
        int left=0;
        int right=0;
        int zeroCount=0;
        int maxCount=0;
        int n=arr.length;
        while(right<n) {
            if(arr[right]==0) {
                zeroCount++;
            }
            while(zeroCount>k) {
                if(arr[left]==0) {
                    zeroCount-=1;
                }
                left++;
            }
            maxCount=Math.max(maxCount,right-left+1);
            right++;
        }
        return maxCount;
    }
}