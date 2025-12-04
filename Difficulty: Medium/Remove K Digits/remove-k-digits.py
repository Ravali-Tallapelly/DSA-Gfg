class Solution:
    def removeKdig(self, s, k):
        st=[]
        for num in s:
            while st and k>0 and st[-1]>num:
                k-=1
                st.pop()
            st.append(num)
        while k>0:
            st.pop()
            k-=1
        res="".join(st).lstrip('0')
        if res:
            return res
        else:
            return 0
        