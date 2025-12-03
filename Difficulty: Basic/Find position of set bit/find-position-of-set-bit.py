#User function Template for python3

class Solution:
    def findPosition(self, n):
        # code here 
        count=0
        ans=-1
        for i in range(0,32):
            if n&(1<<i):
                ans=i+1
                count+=1
        if count==0 or count>1:
            return -1
        else:
            return ans
            
            