class Solution:
    def maxWater(self, arr):
        left=0
        right=len(arr)-1
        maxi=0
        while left<right:
            maxi=max(maxi,min(arr[left],arr[right])*(right-left))
            if arr[left]<=arr[right]:
                left+=1
            else:
                right-=1
        return maxi
            
            
        