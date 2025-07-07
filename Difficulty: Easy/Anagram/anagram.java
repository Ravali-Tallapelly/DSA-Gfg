class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) {
            return false;
        }
        HashMap<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<s1.length();i++) {
            mp1.put(s1.charAt(i),mp1.getOrDefault(s1.charAt(i),0)+1);
        }
        HashMap<Character,Integer> mp2=new HashMap<>();
        for(int i=0;i<s2.length();i++) {
            mp2.put(s2.charAt(i),mp2.getOrDefault(s2.charAt(i),0)+1);
        }
        return mp1.equals(mp2);
        
    }
}