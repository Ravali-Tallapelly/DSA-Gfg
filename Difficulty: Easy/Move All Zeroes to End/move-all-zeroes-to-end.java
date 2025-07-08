// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int k=0;
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                arr[k]=arr[i];
                k++;
            }
            else {
                count++;
            }
        }
        for(int i=arr.length-count;i<arr.length;i++) {
            arr[i]=0;
        }
    }
}