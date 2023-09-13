public class InsertInterval_57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<Integer[]> list = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];
        int[] temp = new int[2];

        for (int i = 0; i < intervals.length; i++) {

            int s = intervals[i][0];
            int e = intervals[i][1];

            if (e < start || end < s) {
                list.add(intervals[i]);
            }
            else if (s < start && start < e) {
                temp[0] = s;
            }
            else if (end <= s)
            
        }
        
    }
}