class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        winSum = sum(nums[:k])
        maxi = winSum
        for i in range(k, len(nums)):
            winSum += nums[i] - nums[i - k]
            maxi = max(maxi, winSum)
        return maxi / k