public class CourseSchedule_207 {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        LinkedList<Integer> [] graph = new LinkedList<Integer>[numCourses];
        int[] dfsColors = new int[numCourses]; //0 white, 1 grey, 2 black

        for (int i = 0; i < prerequisites.length; i++) {

            int[] pair = length[i];
            int start = pair[0];
            int end = pair[1];

            if (graph[start] == null) {
                graph[start] = new ArrayList<Integer>;
            }

            graph[start].add(end);

        }

        LinkedList<Integer> stack = new LinkedList<>();
        HashSet<Integer> discovered = new HashSet<>();

        for (int i = 0; i < numCourses; i++) {
            discovered.add(i);
        }

        stack.addFirst(0);

        while (!stack.isEmpty) {

            int curr = stack.removeFirst();
            if (discovered.contains(curr)) {
                return false;
            }
            else {
                discovered.remove
            }

            LinkedList<Integer> adjList = graph[curr];


            

        }

        

        
        
    }

    


}