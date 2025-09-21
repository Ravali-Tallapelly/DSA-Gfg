#User function Template for python3

class Solution:
     def reverseString(self, s: str) -> str:
        # code here
        tempArr=[]
        for i in s:
            tempArr.append(i)
        left=0
        right=len(tempArr)-1
        while left<right:
            tempArr[left],tempArr[right]=tempArr[right],tempArr[left]
            left+=1
            right-=1
        return "".join(tempArr)