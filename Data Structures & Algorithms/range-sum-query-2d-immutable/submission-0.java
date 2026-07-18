class NumMatrix {
    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        int i = col1;
        while( i <= col2 ){
            for(int j = row1 ; j<= row2 ; j++){
                sum = sum + matrix[j][i];
            }
            i++;

        }
        return sum;
               
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */