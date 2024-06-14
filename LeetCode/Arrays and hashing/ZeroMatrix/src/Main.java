class Main {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;

        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] rowsToZero = new boolean[n];
        boolean[] colsToZero = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rowsToZero[i] = true;
                    colsToZero[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rowsToZero[i] || colsToZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        main.setZeroes(matrix);

        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
