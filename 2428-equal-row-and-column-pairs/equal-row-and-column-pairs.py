class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        cnt = 0
        for i in range(len(grid)):
            lst = []
            for j in range(len(grid[0])):
                lst.append(grid[j][i])
            if lst in grid:
                cnt += grid.count(lst)
        return cnt
        