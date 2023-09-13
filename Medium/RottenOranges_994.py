class RottenOranges_994(object):
    def orangesRotting(self, grid):
        global_time = 0
        queue = []
        fresh_set = set()
        all_zero = True

        for i in range(len(grid)):
            row = []
            for j in range(len(grid[i])):
                if grid[i][j] == 2:
                  queue.append((i,j))
                  grid[i][j] = -1
                  all_zero = False
                
                if grid[i][j] == 1:
                    fresh_set.add((i,j))
                    all_zero = False

        if all_zero:
            return 0
            
        if not queue:
            return -1
        
        while queue:
            coord = queue.pop(0)
            i,j = coord
            time = grid[i][j]

            if coord in fresh_set:
                fresh_set.remove(coord)
            

            if (-time - 1 > global_time):
                global_time = -time - 1

            if i - 1 >= 0 and grid[i-1][j] == 1:
                grid[i-1][j] = time - 1
                queue.append((i-1,j))
            if i + 1 < len(grid) and grid[i+1][j] == 1:
                grid[i+1][j] = time - 1
                queue.append((i+1,j))
            if j - 1 >= 0 and grid[i][j - 1] == 1:
                grid[i][j-1] = time - 1
                queue.append((i,j-1))
            if j + 1 <len(grid[i]) and grid[i][j + 1] == 1:
                grid[i][j+1] = time - 1
                queue.append((i,j+1))

        if  fresh_set:
            return -1
        
        return global_time