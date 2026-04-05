class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        lSum = 0
        rSum = 0
        for i in nums:
            rSum += i
        for i in range(len(nums)):
            rSum -= nums[i]
            if lSum == rSum:
                return i
            lSum += nums[i]
        return -1