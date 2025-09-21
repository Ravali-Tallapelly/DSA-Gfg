class Solution:
    def hasTripletSum(self, arr, target):
        # Code Here
        arr.sort()
        right=len(arr)-1
        for curr in range(len(arr)):
            left=curr+1
            right=len(arr)-1
            while left<right:
                if arr[curr]+arr[left]+arr[right]==target:
                    return True
                elif arr[curr]+arr[left]+arr[right]<target:
                    left+=1
                else:
                    right-=1
        return False
        # 1 6 8 9 23 56 74 78 80 81 87 101 124 127 134