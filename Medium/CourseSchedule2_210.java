public class CourseSchedule2_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] empty = new int[0];
        int[] inDegree = new int[numCourses];
        LinkedList<Integer>[] adjList = new LinkedList[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int inVertex = prerequisites[i][0];
            inDegree[inVertex]++;
            int outVertex = prerequisites[i][1];
            if(adjList[outVertex] == null) {
                adjList[outVertex] = new LinkedList<>();
            }
            adjList[outVertex].addFirst(inVertex);
        }

        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 0; i < inDegree.length; i++) {
            if(inDegree[i] == 0) {
                queue.addFirst(i);
            }
        }

        LinkedList<Integer> sorting = new LinkedList<>();
        int countedVertices = 0;
        while(!queue.isEmpty()) {
            countedVertices++;
            int currVertex = queue.removeFirst();
            if(inDegree[currVertex] != 0) {
                return empty;
            }
            sorting.addLast(currVertex);
            if(adjList[currVertex] != null) {
                for (int adjVertex : adjList[currVertex]) {
                    inDegree[adjVertex]--;
                    if (inDegree[adjVertex] == 0) {
                        queue.addFirst(adjVertex);
                    }
                }
            }
        }

        if(countedVertices!=numCourses) {
            return empty;
        }
        else{
            int[] output = new int[sorting.size()];
            for(int i = 0; i < output.length; i++){
                output[i]=sorting.get(i);
            }
            return output;
        }

    }

}