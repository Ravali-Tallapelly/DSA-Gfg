class Solution {
    int stockBuySell(int arr[]) {
        // code here
        int totalProfit=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>arr[i-1]) {
                totalProfit+=(arr[i]-arr[i-1]);
            }
        }
        return totalProfit;
    }
}
