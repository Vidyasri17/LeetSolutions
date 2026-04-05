class Solution:
    def minFlips(self, a: int, b: int, c: int) -> int:
        cnt = 0

        while a > 0 or b > 0 or c > 0:
            A = a & 1
            B = b & 1
            C = c & 1

            if C == 1:
                if A == 0 and B == 0:
                    cnt += 1
            else: 
                cnt += A + B

            a >>= 1
            b >>= 1
            c >>= 1

        return cnt


        