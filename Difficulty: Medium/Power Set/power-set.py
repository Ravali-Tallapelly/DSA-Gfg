#User function Template for python3

class Solution:
	def AllPossibleStrings(self, s):
	    n=len(s)
	    res=[]
	    for i in range(1,(1<<n)):
	        sub=""
	        for j in range(n):
	            if (i&(1<<j))!=0:
	                sub+=s[j]
	        res.append(sub)
	    res.sort()
	    return res
	    