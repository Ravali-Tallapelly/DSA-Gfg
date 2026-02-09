class Solution:
    def sumOfDigits(self, n):
        sm=0
        while n>0:
            rem=n%10 
            sm+=rem 
            n//=10 
        return sm