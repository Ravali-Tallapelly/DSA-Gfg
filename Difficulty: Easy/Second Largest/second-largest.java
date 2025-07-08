class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=-1;
        int prev=largest;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>largest) {
                prev=largest;
                largest=arr[i];
            }
            else if(prev<arr[i] && arr[i]<largest) {
                prev=arr[i];
            }
        }
        return prev;
    }
}