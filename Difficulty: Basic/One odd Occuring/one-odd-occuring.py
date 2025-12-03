class Solution:
    def getOddOccurrence(self, arr):
        ans=0
        for i in range(len(arr)):
            ans^=arr[i]
        return ans