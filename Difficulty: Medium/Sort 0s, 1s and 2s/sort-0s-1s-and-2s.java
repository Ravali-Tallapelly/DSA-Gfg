class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int left=0;
        int mid=0;
        int right=arr.length-1;
        while(mid<=right) {
            if(arr[mid]==0)  {
                int temp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                left++;
                mid++;
            }
            else if(arr[mid]==1) {
                mid++;
            }
            else {
                int temp=arr[right];
                arr[right]=arr[mid];
                arr[mid]=temp;
                right--;
            }
            
        }
    }
}