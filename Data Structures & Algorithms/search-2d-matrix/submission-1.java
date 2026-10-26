// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n = matrix[0].length;
//         int m = matrix.length;
//         for(int i = 0; i < m; i++){
//             if(target <= matrix[i][n-1]){
//                 int s = 0;
//                 int e = n-1;
//                 while(s<=e){
//                     int mid = s + (e-s)/2;
//                     if(matrix[i][mid] == target){
//                         return true;
//                     }
//                     else if(matrix[i][mid] < target){
//                         s = mid + 1;
                        
//                     }else{
//                         e = mid-1;
//                     }
//                 }

//             }else{
//                 continue;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int s = 0;
        int e = m * n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int val = matrix[mid / n][mid % n]; // Map 1D index to 2D row/col

            if (val == target) {
                return true;
            } else if (val < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return false;
    }
}