from collections import deque

class NumberOfIslands_200(object):
     def numIslands(self, grid):
        queue = deque()

        for i in range(len(grid)):
           for j in range(len(grid[0])):
               if grid[i][j] == '1':
                   queue.append((i,j))


        def search(grid,coord,queue):
            i,j = coord
            grid[i][j] = '2'
            queue.remove(coord)
            if i - 1 >= 0 and grid[i-1][j] == '1':
                search(grid,(i - 1, j), queue)
            if i + 1 < len(grid) and grid[i+1][j] == '1':
                search(grid,(i + 1, j), queue)
            if j - 1 >= 0 and grid[i][j - 1] == '1':
                search(grid,(i, j - 1), queue)
            if j + 1 <len(grid[i]) and grid[i][j + 1] == '1':
                search(grid,(i, j + 1), queue)

        count = 0
        while queue:
            val = queue[0]
            count = count +1
            search(grid, val, queue)

        return count