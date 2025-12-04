
#User function Template for python3


class Solution:
    
    #Function to check if the given pattern exists in the given string or not.
    def search(self,p,s):
        m=len(s)
        n=len(p)
        for i in range(m):
            if s[i:i+n]==p:
                return True
        return False