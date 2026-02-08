#User function Template for python3
class Solution:
    # Function to calculate the sum of squares of first 'number' natural numbers
    def sumOfSquares(self, number):
        # code here
        sm=0
        for i in range(1,number+1):
            sm+=(i*i)
        return sm