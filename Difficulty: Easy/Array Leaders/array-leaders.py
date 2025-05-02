class Solution:
    def leaders(self, arr):
        # code here
        n=len(arr)
        max_r=arr[n-1]
        res=[]
        
        for i in range(n-2,-1,-1):
            if arr[i]>=max_r:
                res.append(max_r)
                max_r=arr[i]
        res.append(max_r)
        return res[::-1]





#{ 
 # Driver Code Starts
t = int(input())  # number of test cases
for _ in range(t):
    arr = list(map(int, input().split()))  # input array
    s = Solution().leaders(arr)  # find the leaders

    # Output formatting
    if s:
        print(" ".join(map(str, s)))  # Print leaders in the required order
    else:
        print("[]")  # Print empty list if no leaders are found

    print("~")

# } Driver Code Ends