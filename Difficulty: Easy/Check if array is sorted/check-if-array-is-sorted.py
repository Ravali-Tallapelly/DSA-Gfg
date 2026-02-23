class Solution:
    def isSorted(self, arr) -> bool:
        # code here
        n=len(arr)
        first=arr[0]
        for i in range(1,n):
            if arr[i]>=first:
                first=arr[i]
                continue 
            else:
                return False 
        return True