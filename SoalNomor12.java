public class SoalNomor12 {
    public static void main(String[] args) {
        int[][] grid = {
            {5, 3, 2, 1},
            {1, 2, 10, 2},
            {4, 3, 1, 3},
            {2, 1, 2, 20}
        };
        
        int n = grid.length;
        int[][] dp = new int[n][n];
        String[][] path = new String[n][n];
        
        // Inisialisasi DP dan path
        dp[0][0] = grid[0][0];
        path[0][0] = "(0,0)";
        
        // Isi baris pertama
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
            path[0][j] = path[0][j-1] + " → (0," + j + ")";
        }
        
        // Isi kolom pertama
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
            path[i][0] = path[i-1][0] + " → (" + i + ",0)";
        }
        
        // Isi sisa grid
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i-1][j] > dp[i][j-1]) {
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                    path[i][j] = path[i-1][j] + " → (" + i + "," + j + ")";
                } else {
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                    path[i][j] = path[i][j-1] + " → (" + i + "," + j + ")";
                }
            }
        }
        
        System.out.println("Jalur terbaik: " + path[n-1][n-1]);
        System.out.println("Total Energi Maksimum: " + dp[n-1][n-1]);
    }
}