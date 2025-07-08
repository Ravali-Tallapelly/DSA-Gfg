class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            if(mp.get(arr[i])>arr.length/2) {
                return arr[i];
            }
        }
        return -1;
        
    }
}