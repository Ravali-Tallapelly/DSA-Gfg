class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        res.add(arr[n-1]);
        int maxi=arr[n-1];
        for(int i=n-2;i>=0;i--) {
            if(maxi<=arr[i]) {
                res.add(arr[i]);
                maxi=arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }
}
