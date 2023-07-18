public class FloodFill_733{

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int startColor = image[sr][sc];
        int[][] location = new int [image.length][image[0].length]; 
        fill (image, location, sr, sc, color, startColor);
        return image;
        
    }

    public void fill (int[][] image, int[][] location, int sr, int sc, int color, int startColor) {

        
        image[sr][sc] = color;
        location[sr][sc] = 1; 

        if (sc - 1 >= 0 && image[sr][sc - 1] == startColor && location[sr][sc - 1] == 0 ) {
            fill (image, location, sr, sc - 1, color, startColor);
        }

        if (sc + 1 < image[sr].length && image[sr][sc + 1] == startColor && location[sr][sc + 1] == 0) {
            fill (image, location, sr, sc + 1, color, startColor);
        }

        if (sr - 1 >= 0 && image[sr - 1][sc] == startColor  && location[sr-1][sc] == 0) {
            fill (image, location, sr - 1, sc, color, startColor);
        }

        if (sr + 1 < image.length && image[sr + 1][sc] == startColor && location[sr+1][sc] == 0) {
            fill (image, location, sr + 1, sc, color, startColor);
        }
    }
}