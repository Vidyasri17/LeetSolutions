class Solution:
    def mergeAlternately(self, w1: str, w2: str) -> str:
        ans = []
        n = min(len(w1), len(w2))
        for i in range(n):
            ans.append(w1[i])
            ans.append(w2[i])
        if n < len(w1):
            ans.append(w1[n::])
        else:
            ans.append(w2[n::])
        return "".join(ans)