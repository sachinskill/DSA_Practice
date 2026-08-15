class Solution {
     public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        
        // Prefix sum matrix with an extra row and column for easy boundaries
        int[][] pref = new int[m + 1][n + 1];
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                pref[r + 1][c + 1] = mat[r][c] 
                    + pref[r][c + 1] 
                    + pref[r + 1][c] 
                    - pref[r][c];
            }
        }
        
        int[][] answer = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Define the block boundaries
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);
                
                // Convert to 1-indexed for the prefix sum array
                r1++; c1++; r2++; c2++;
                
                // Region sum query
                answer[i][j] = pref[r2][c2] 
                             - pref[r1 - 1][c2] 
                             - pref[r2][c1 - 1] 
                             + pref[r1 - 1][c1 - 1];
            }
        }
        
        return answer;
    }
}