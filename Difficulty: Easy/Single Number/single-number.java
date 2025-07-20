// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
        int left=1;
        Arrays.sort(arr);
        while(left<arr.length) {
            if(arr[left]==arr[left-1]) {
                left+=2;
                continue;
            }
            else {
                return arr[left-1];
            }
        }
        return arr[left-1];
    }
}