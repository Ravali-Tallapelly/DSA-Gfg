#User function Template for python3
class Solution:
	def removeDups(self, str):
	    res=""
	    for i in str:
	        if i in res:
	            continue
	        else:
	            res+=i
	    return res
	            