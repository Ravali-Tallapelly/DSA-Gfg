class Solution {
    public int celebrity(int mat[][]) {
        int m=mat.length;
        int i=0;
        int j=m-1;
        while(i<j) {
            if(mat[j][i]==1) {
                j--;
            }
            else {
                i++;
            }
        }
        int c=i;
        for(int k=0;k<m;k++) {
            if(k==c){
                continue;
            }
            if(mat[c][k]!=0 || mat[k][c]==0) {
                return -1;
            }
        }
        return c;
        
    }
}