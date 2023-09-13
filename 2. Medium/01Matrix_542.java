public class 01Matrix_542 {
    public int[][] updateMatrix(int[][] mat) {

        int[][] solution = new int[mat.length][mat[0].length];
        LinkedList<int[]> queue = new LinkedList<>();
        HashSet<int[]> set = new HashSet<>();

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++){

                if (mat[i][j] == 0) {
                    solution[i][j] = 0; // 0,2 -->
                    int[] test = {j,i}; //2,0 (x,y)
                    queue.add(test);
                    set.add(test);
                }

                else {
                    solution[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        System.out.println();

        int[] element = new int[2]; 
        int x; 
        int y;

        while (!queue.isEmpty()){

            element = queue.removeFirst();
            x = element[0];
            y = element[1]; 

            int smallest = mat.length * mat[0].length;

            
                    if (inBounds(mat, x-1, y)) {

                        int[] neighbor = {x-1, y};
                        if (solution[y][x-1] == Integer.MAX_VALUE && !set.contains(neighbor)) {
                            queue.addLast(neighbor);
                            set.add(neighbor);
                        }

                        if (solution[y][x-1] < smallest) {
                            smallest = solution[y][x-1];
                        }
                    }

                    if (inBounds(mat, x+1, y)) {

                        int[] neighbor = {x+1, y};
                        if (solution[y][x+1] == Integer.MAX_VALUE && !set.contains(neighbor)) {
                            queue.addLast(neighbor);
                            set.add(neighbor);
                        }

                        if (solution[y][x+1] < smallest) {
                            smallest = solution[y][x+1];
                        }
                    }

                    if (inBounds(mat, x, y-1)) {

                        int[] neighbor = {x, y-1};
                        if (solution[y-1][x] == Integer.MAX_VALUE && !set.contains(neighbor)) {
                            queue.addLast(neighbor);
                            set.add(neighbor);
                        }

                        if (solution[y-1][x] < smallest) {
                            smallest = solution[y-1][x];
                        }
                    }

                    if (inBounds(mat, x, y+1)) {

                        int[] neighbor = {x, y+1};
                        if (solution[y+1][x] == Integer.MAX_VALUE && !set.contains(neighbor)) {
                            queue.addLast(neighbor);
                            set.add(neighbor);
                        }

                        if (solution[y+1][x] < smallest) {
                            smallest = solution[y+1][x];
                        }
                    }

            solution[y][x] = Math.min(solution[y][x], (smallest+1));

        }

        return solution;

    }

    private boolean inBounds(int[][] mat, int x , int y) {

        return (x >= 0 && x < mat[0].length && y >= 0 && y < mat.length);
        
    }

}