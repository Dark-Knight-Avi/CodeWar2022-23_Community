class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                temp[i][j] = matrix[i][j];
            }
        }
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                if(matrix[row][col] == 0){
                    int idxc = 0;
                    while(idxc < m){
                        if (matrix[idxc][col] == 0) idxc++;
                        else temp[idxc++][col] = 0;
                    }
                    int idxr = 0;
                    while (idxr < n){
                        if (matrix[row][idxr] == 0) idxr++;
                        else temp[row][idxr++] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
