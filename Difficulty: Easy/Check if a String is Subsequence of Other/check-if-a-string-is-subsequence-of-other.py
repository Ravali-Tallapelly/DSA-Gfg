class Solution:
    def isSubSeq(self, s1, s2):
        ind=0
        for i in range(len(s2)):
            if s1[ind]==s2[i]:
                ind+=1
            if ind==len(s1):
                return True
        return False
            
        