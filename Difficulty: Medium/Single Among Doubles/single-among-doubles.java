// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        if(n==1) {
            return arr[0];
        }
        if(arr[0]!=arr[1]) {
            return arr[0];
        }
        for(int i=1;i<arr.length;i+=2) {
            if(arr[i]!=arr[i-1]) {
                return arr[i-1];
            }
        }
        return arr[n-1];
        
    }
}