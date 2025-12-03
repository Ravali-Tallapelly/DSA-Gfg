#User function Template for python3
class Solution:
	def getBinaryRep(self, n):
		# code here
		ans=""
		for i in range(31,-1,-1):
		    if n&(1<<i):
		        ans+='1'
		    else:
		        ans+='0'
		return ans