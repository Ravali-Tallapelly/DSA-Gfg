class Solution:
    def wordBreak(self, s, dictionary):
        
        word_set = set(dictionary)
        n = len(s)
        max_len = max(len(w) for w in word_set)  # longest word length

        dp = [False] * (n + 1)
        dp[0] = True

        for i in range(1, n + 1):
            # Only check up to max_len characters back
            for l in range(1, min(i, max_len) + 1):
                if not dp[i - l]:
                    continue
                if s[i - l:i] in word_set:
                    dp[i] = True
                    break

        return dp[n]

