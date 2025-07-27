// User function Template for Java

class Solution {
    public int maxWeightCell(int[] exits) {
        if(exits.length==1) {
            return 0;
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        int res=0;
        int ind=0;
        for(int i=0;i<exits.length;i++) {
            if(!mp.containsKey(exits[i])) {
                mp.put(exits[i],i);
                if(mp.get(exits[i])>=res) {
                    res=mp.get(exits[i]);
                    ind=exits[i];
                }
            }
            else {
                mp.put(exits[i],mp.get(exits[i])+i);
                if(mp.get(exits[i])>=res) {
                    res=mp.get(exits[i]);
                    ind=exits[i];
                }
            }
        }
        return ind;
    }
}

