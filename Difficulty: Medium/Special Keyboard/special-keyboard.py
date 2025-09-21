#User function Template for python3

class Solution:
    def optimalKeys(self, N):
        if N<=6:
            return N
        dp=[0]*(N+1)
        for i in range(7):
            dp[i]=i

        for i in range(7,N+1):
            dp[i]=0
            for j in range(i-3,0,-1):
                curr_val=dp[j]*(i-j-1)
                dp[i]=max(dp[i],curr_val)
        return dp[N]

