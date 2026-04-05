
from collections import Counter
class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1) != len(word2):
            return False
        f1 = Counter(word1)
        f2 = Counter(word2)
        
        return f1.keys() == f2.keys() and sorted(f1.values()) == sorted(f2.values())