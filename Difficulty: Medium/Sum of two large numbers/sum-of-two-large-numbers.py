class Solution:
	def findSum(self, s1, s2):
		# code here
		if not s1:
		    return s2
		if not s2:
		    return s1
		i=len(s1)-1
		j=len(s2)-1
		carry=0
		res=[]
		while i>=0 or j>=0 or carry>0:
		    digit1=int(s1[i] if i>=0 else 0)
		    digit2=int(s2[j] if j>=0 else 0)
		    digit=digit1+digit2+carry
		    carry=(digit)//10
		    digit%=10
		    res.append(str(digit))
		    i-=1
		    j-=1
	    while len(res)>1 and res[-1]=='0':
		    res.pop()
		return "".join(res[::-1])

		 
		    
		    