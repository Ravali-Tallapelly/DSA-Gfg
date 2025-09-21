class Solution:
    def removeDuplicates(self, arr):
        temp=[]
        seen=set()
        for i in arr:
            if i not in seen:
                seen.add(i)
                temp.append(i)
        return temp