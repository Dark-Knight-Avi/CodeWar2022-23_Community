class Solution {
    public boolean dfs(char [][] board, String input, int index, int i, int j, int m, int n, boolean [][] visited){
        if(index == input.length()){
            return true;
        } 
        if(i >= m || j >= n || i < 0 || j < 0 || board[i][j] != input.charAt(index) || visited[i][j]){
            return false;
        }
        visited[i][j] = true;
        boolean exists = dfs(board, input, index + 1, i + 1, j, m, n, visited);
        if(!exists){
            exists = exists || dfs(board, input, index + 1, i - 1, j, m, n, visited);
        }
        if(!exists){
            exists = exists || dfs(board, input, index + 1, i, j + 1, m, n, visited);
        }
        if(!exists){
            exists = exists || dfs(board, input, index + 1, i, j - 1, m, n, visited);
        }
        visited[i][j] = false;
        return exists;
    }
    
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean isExists = dfs(board, word, 0, i, j, m, n, new boolean[m][n]);
                    if(isExists){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
