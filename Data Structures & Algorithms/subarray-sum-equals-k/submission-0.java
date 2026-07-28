class Solution {
    public int subarraySum(int[] nums, int k) {
        int tSub = 0;
        int p1 = 0;
        while(p1<nums.length){
            int currentSum = 0;
            for(int i = p1; i < nums.length; i++){
                currentSum += nums[i];
                if(currentSum == k){
                    tSub++;
                }

            }
            p1++;

        }
        return tSub;
        
    }
}