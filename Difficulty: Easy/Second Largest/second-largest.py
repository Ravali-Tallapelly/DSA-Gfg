class Solution:
    def getSecondLargest(self, arr):
        first=float('-inf')
        second=float('-inf')
        n=len(arr)
        for i in range(n):
            if arr[i]>first:
                second=first 
                first=arr[i]
            if arr[i]>second and arr[i]!=first:
                second=arr[i]
        if second==float('-inf'):
            return -1 
        else:
            return second