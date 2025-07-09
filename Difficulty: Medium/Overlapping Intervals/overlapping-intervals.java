class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int mini=arr[0][0];
        int maxi=arr[0][1];
        int n=arr.length;
        List<int[]> res=new ArrayList<>();
        for(int i=1;i<n;i++) {
            if(arr[i][0]<=maxi) {
                maxi=Math.max(arr[i][1],maxi);
            } 
            else {
                res.add(new int[]{mini,maxi});
                mini=arr[i][0];
                maxi=arr[i][1];
            }
            
        }
        res.add(new int[]{mini,maxi});
        return res;
    }
}