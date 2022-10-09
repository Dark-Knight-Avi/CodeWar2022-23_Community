class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] image = new int[n][m];
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        int idx = 0;
        while (left < n){
            int left_img = 0;
            for(int i = bottom; i >= top; i--){
                image[idx][left_img++] = matrix[i][left];
            }
            left++;
            idx++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = image[i][j];
            }
        }
    }
}
