class Solution {
    public int[] findDiagonalOrder(int[][] arr) {
        if (arr.length == 0 || arr[0].length == 0) {
            return new int[0];
        }
        int m = arr.length;
        int n = arr[0].length;
        int[] res = new int[m * n];
        int idx = 0;
        int row = 0, col = 0;
        boolean up = true;
        while (row < m && col < n) {
            if (up) {
                while (row > 0 && col < n - 1) {
                    res[idx++] = arr[row][col];
                    row--;
                    col++;
                }
                res[idx++] = arr[row][col];
                if (col == n - 1) {
                    row++;
                } else {
                    col++;
                }
            } else {
                while (col > 0 && row < m - 1) {
                    res[idx++] = arr[row][col];
                    row++;
                    col--;
                }
                res[idx++] = arr[row][col];
                if (row == m - 1) {
                    col++;
                } else {
                    row++;
                }
            }
            up = !up;
        }
        return res;
    }
}
