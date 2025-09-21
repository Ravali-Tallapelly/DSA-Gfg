#User function Template for python3

class Solution:
    def factorial(self,n):
        res=1
        for i in range(1,n+1):
            res*=i 
        return res
            
	def findRank(self, S):
	    length=len(S)
	    rank=1
	    for i in range(length):
	        smaller=0
	        for j in range(i+1,length):
	            if S[i]>S[j]:
	                smaller+=1
	        rank+=(smaller*(self.factorial(length-i-1)))
	    return rank
	    
	    