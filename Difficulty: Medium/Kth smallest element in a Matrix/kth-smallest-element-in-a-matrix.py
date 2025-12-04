class Solution:
    def kthSmallest(self, mat, k):
        # code here
        n=len(mat)
        lst=[]
        for i in range(n):
            for j in range(n):
                lst.append(mat[i][j])
        lst.sort()
        return lst[k-1]
        
            
            
                
        