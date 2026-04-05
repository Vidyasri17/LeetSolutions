class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        cnt = 0
        l = 0
        r = len(nums) - 1
        while l < r:
            temp = nums[l] + nums[r]
            if temp == k:
                cnt += 1
                l += 1
                r -= 1
            elif temp < k:
                l += 1
            else:
                r -= 1
        return cnt