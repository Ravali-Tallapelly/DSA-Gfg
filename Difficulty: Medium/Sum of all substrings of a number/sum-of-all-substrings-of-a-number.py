class Solution:
    def subString(self,s,ind,n,curr,res):
        if n==ind:
            return 
        curr+=s[ind]
        res.append(curr)
        self.subString(s,ind+1,n,curr,res)
    def sumSubstrings(self,s):
        res=[]
        curr=""
        for start in range(len(s)):
            self.subString(s,start,len(s),curr,res)
        sum=0
        for i in res:
            sum+=int(i)
        return sum

            
        