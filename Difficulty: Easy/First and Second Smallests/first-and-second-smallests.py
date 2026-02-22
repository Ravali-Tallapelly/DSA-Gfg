class Solution:
    def minAnd2ndMin(self, arr):
        # code here
        firstSmall=float('inf')
        secondSmall=float('inf')
        for i in range(len(arr)):
            if arr[i]<firstSmall:
                secondSmall=firstSmall 
                firstSmall=arr[i]
            elif arr[i]<secondSmall and arr[i]!=firstSmall:
                secondSmall=arr[i]
        if secondSmall==float('inf') or firstSmall==secondSmall:
            return [-1] 
        else:
            return firstSmall,secondSmall
        
