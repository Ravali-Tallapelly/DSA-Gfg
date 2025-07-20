// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int sum=0;
        int maxLength=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            if(sum==k) {
                maxLength=i+1;
            }
            if(mp.containsKey(sum-k)) {
                maxLength=Math.max(maxLength,i-mp.get(sum-k));
            }
            if(!mp.containsKey(sum))
            {
                mp.put(sum,i);
            }
        }
        return maxLength;
    }
}
