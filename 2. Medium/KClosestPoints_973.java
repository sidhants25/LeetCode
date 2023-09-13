public class KClosestPoints_973 {

    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> heap = new PriorityQueue(k, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]);
            }
        });
        

        for(int i = 0; i < points.length; i++){
            heap.add(points[i]);
        }

        int[][] result = new int[k][2];

        for(int i = 0; i < k; i++){
            result[i] = heap.poll();
        }

        return result;
    }
}