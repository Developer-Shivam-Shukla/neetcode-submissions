class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int left = 0;
        int right = heights.length-1;
        while(left < right){
            int area = min(heights, left, right) * (right - left);
            res = max(area , res);
            if(heights[left] <= heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
        
    }
    static int min(int[]arr ,int i , int j){
        if(arr[i]<=arr[j]){
            return arr[i];

        }else{
            return arr[j];
        }

    }
    static int max(int i , int j){
        if(i <= j){
            return j;

        }else{
            return i;
        }

    }
    
}
