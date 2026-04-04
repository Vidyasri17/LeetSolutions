class Solution:
    def compress(self, chars: List[str]) -> int:
        i = 0
        idx = 0
        while i < len(chars):
            ch = chars[i]
            count = 0
            while i < len(chars) and chars[i] == ch:
                i += 1
                count += 1
            chars[idx] = ch
            idx += 1
            if count > 1:
                for digit in str(count):
                    chars[idx] = digit
                    idx += 1
        return idx

