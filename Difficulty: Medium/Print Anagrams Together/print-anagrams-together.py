#User function Template for python3


class Solution:

    def anagrams(self, arr):
        tempDict={}
        for i in arr:
            key="".join(sorted(i))
            if key in tempDict.keys():
                tempDict[key].append(i)
            else:
                tempDict[key]=[i]
        res=[]
        for v in tempDict.values():
            res.append(v)
        return res
            
                
        
