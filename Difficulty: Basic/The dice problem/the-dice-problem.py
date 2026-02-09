#User function Template for python3

class Solution:
    def oppositeFaceOfDice(self, n):
    	if n<1 or n>6:
    	    return 
    	d={1:6,2:5,3:4,4:3,5:2,6:1}
    	return d[n]