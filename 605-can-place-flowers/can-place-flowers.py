class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], N: int) -> bool:
        n = len(flowerbed)
        cnt = 0
        for i in range(n):
            if flowerbed[i] == 0:
                prev = 0 if i == 0 else flowerbed[i - 1]
                next = 0 if i + 1 == n else flowerbed[i + 1]
                if prev == 0 and next == 0:
                    flowerbed[i] = 1
                    cnt += 1
                    if cnt >= N:
                        return True
        return cnt >= N