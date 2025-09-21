class Solution:
	def twoSum(self, arr, target):
		n=len(arr)
		left=0
		right=n-1
		arr.sort()
		while left<right:
		    if arr[left]+arr[right]==target:
		        return True
		    elif arr[left]+arr[right]>target:
		        right-=1 
		    else:
		        left+=1
		return False