class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count=0;
        int n=arr.length;
        int maxCount=0;
        int bit=arr[0];
        for(int i=0;i<n;i++) {
            if(arr[i]==bit) {
                count+=1;
            }
            else {
                bit=arr[i];
                maxCount=Math.max(maxCount,count);
                count=1;
            }
        }
        maxCount=Math.max(maxCount,count);
        return maxCount;
    }
}
