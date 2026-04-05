class Solution:
    def removeStars(self, s: str) -> str:
        st = []
        for ch in list(s):
            if ch != '*':
                st.append(ch)
            else:
                st.pop()
        return "".join(st)