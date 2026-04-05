class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        ans = -1
        while left < right:
            w = right - left
            l = min(height[left], height[right])
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
            ans = max(ans, l * w)
        return ans