class Solution {
    void pushZerosToEnd(int[] arr) {
        int k=0;
        int zeroCount=0;
        int n=arr.length;
        for(int i=0;i<n;i++) {
            if(arr[i]!=0) {
                arr[k++]=arr[i];
            }
            else if(arr[i]==0) {
                zeroCount++;
            }
        }
        for(int i=n-zeroCount;i<n;i++) {
            arr[i]=0;
        }
    }
}