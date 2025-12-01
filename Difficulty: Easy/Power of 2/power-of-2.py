class Solution:
    def isPowerofTwo(self, n):
        # code here
        return n^(n-1)>=n