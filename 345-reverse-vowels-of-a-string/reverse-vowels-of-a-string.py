class Solution:
    def reverseVowels(self, s: str) -> str:
        l = 0
        r = len(s) - 1
        lst = list(s)
        while(l < r):
            if self.isVowel(s[l]) and self.isVowel(s[r]):
                ch = lst[r]
                lst[r] = lst[l]
                lst[l] = ch
                l += 1
                r -= 1

            elif self.isVowel(lst[l]):
                r -= 1
            elif self.isVowel(lst[r]):
                l += 1
            else:
                l += 1
                r -= 1


        return "".join(lst)

    def isVowel(self, ch) -> bool:
        vowels = "aeiouAEIOU"
        return ch in vowels