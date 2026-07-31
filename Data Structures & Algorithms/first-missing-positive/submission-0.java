class Solution {
    public int firstMissingPositive(int[] nums) {

        
        int i = 0 ;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swapNo(nums, i, correct);
            }else{
                i++;
            }
        }
        //find first missing number

        for(int j = 0 ; j < nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }

        //case 2 : array is completed
        return nums.length+1;

        
    }
    static void swapNo(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        
    }
}