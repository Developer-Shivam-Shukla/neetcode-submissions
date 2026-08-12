class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        ArrayList<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long required = (long) nums[i] + nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long calc = (long) target - nums[left] - nums[right];
                    if (calc > required) {
                        left++;

                    } else if (calc < required) {
                        right--;
                    } else if (calc == required) {
                        if (!arr.contains(
                                Arrays.asList(nums[i], nums[j], nums[right], nums[left]))) {
                            arr.add(Arrays.asList(nums[i], nums[j], nums[right], nums[left]));
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return arr;
    }
}