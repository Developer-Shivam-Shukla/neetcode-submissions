class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        for(int i = 0; i < m; i++){
            if(target <= matrix[i][n-1]){
                int s = 0;
                int e = n-1;
                while(s<=e){
                    int mid = s + (e-s)/2;
                    if(matrix[i][mid] == target){
                        return true;
                    }
                    else if(matrix[i][mid] < target){
                        s = mid + 1;
                        
                    }else{
                        e = mid-1;
                    }
                }

            }else{
                continue;
            }
        }
        return false;
    }
}
