class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = set('aeiouAEIOU')
        winCnt = 0
        for i in range(k):
            if s[i] in vowels:
                winCnt += 1
        ans = winCnt
        for i in range(k, len(s)):
            if s[i - k] in vowels:
                winCnt -= 1
            if s[i] in vowels:
                winCnt += 1
            ans = max(ans, winCnt)
            if ans == k: 
                return k
        return ans
