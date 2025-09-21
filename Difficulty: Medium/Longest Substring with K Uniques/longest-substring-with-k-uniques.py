class Solution:
    def longestKSubstr(self, s, k):
        n=len(s)
        left=0
        d={}
        maxLen=-1
        for i in range(n):
            if s[i] not in d.keys():
                d[s[i]]=1
            else:
                d[s[i]]+=1
            while len(d)>k:
                d[s[left]]-=1
                if d[s[left]]==0:
                    del d[s[left]]
                left+=1
            if len(d)==k:
                maxLen=max(maxLen,i-left+1)
        return maxLen
                
            
            
        
                
            
        
        