#User function Template for python3
class Solution:
    def checkValidity(self, a: int, b: int, c: int) -> bool:
        # code here
        if (a+b)<=c or (a+c)<=b or (b+c)<=a:
            return False
        else:
            return True
