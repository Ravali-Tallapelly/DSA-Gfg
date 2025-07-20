// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i)>=0) {
                pos.add(arr.get(i));
            }
            else {
                neg.add(arr.get(i));
            }
        }
        int i=0;
        int po=0;
        int ne=0;
        while(po<pos.size()&& ne<neg.size()) {
            arr.set(i++,pos.get(po++));
            arr.set(i++,neg.get(ne++));
        }
        while(po<pos.size()) {
            arr.set(i++,pos.get(po++));
        }
        while(ne<neg.size()) {
            arr.set(i++,neg.get(ne++));
        }
    }
}