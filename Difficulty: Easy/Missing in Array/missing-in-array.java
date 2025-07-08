class Solution {
    int missingNum(int arr[]) {
        // code here
        int k=1;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++) {
            if(arr[i]==k) {
                k++;
                continue;
            }
            else {
                return k;
            }
        }
        return k;
    }
}