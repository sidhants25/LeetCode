public class CourseSchedule_207 {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        LinkedList<Integer>[] graph = new LinkedList[numCourses];
        int[] dfsColors = new int[numCourses]; //0 white, 1 grey, 2 black

        ArrayList<Integer> set = new ArrayList<Integer>(); 

        for (int i = 0; i < numCourses; i++) {
            set.add(i);
        }

        for (int i = 0; i < prerequisites.length; i++) {

            int[] pair = prerequisites[i];
            int start = pair[0];
            int end = pair[1];

            if (graph[start] == null) {
                graph[start] = new LinkedList<Integer>();
            }
            graph[start].add(end);
            

        }

        LinkedList<Integer> stack = new LinkedList<>();
   

        while (!stack.isEmpty() || !set.isEmpty()) {

            if (stack.isEmpty()) {

                if (!set.isEmpty()) {
                    System.out.println("Refilling stack");
                    stack.addFirst(set.remove(0));
                }
                
                else {
                    System.out.println("Set is full: True");
                   return true;
                }
                
            }

            int curr = stack.peek();

            System.out.println("Curr: " + curr);

            if (dfsColors[curr] == 0) {
                
                dfsColors[curr] = 1;

                if (graph[curr] != null) {
                LinkedList<Integer> adjList = graph[curr];

                for (int i = 0; i < adjList.size(); i++) {
                    int v = adjList.get(i);

                    System.out.println("Neighbor " + i + ": " + v);

                    if (dfsColors[v] == 1) {
                        System.out.println("Returning false");
                        return false;
                    }

                    else if (dfsColors[v] == 0){
                        stack.addFirst(v);
                    }
                }
            }

            else {
                stack.removeFirst();
                if (set.contains(curr)) {
                    set.remove(set.indexOf(curr));
                }
                
                dfsColors[curr] = 2;
            }


            }

            else {
                stack.removeFirst();
                if (set.contains(curr)) {
                    set.remove(set.indexOf(curr));
                }
                dfsColors[curr] = 2;
            }
           


        }

        System.out.print("Finished");
        return true;

        
        
    }

    


}