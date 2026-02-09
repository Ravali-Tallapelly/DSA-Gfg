class Solution:
    def findSum(self, n):
        # code here
        if n==0:
            return 0
        sm=0
        for i in range(1,n+1):
            sm+=i 
        return sm
        
