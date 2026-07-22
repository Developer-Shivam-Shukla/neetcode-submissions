

class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        int largest = 1;

        HashMap<Integer, ArrayList<Integer>> bigArray = new HashMap<>();

        for (int i = 0; i < n; i++) {

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(nums[i]);

            int current = nums[i];

            boolean found = true;

            while (found) {
                found = false;

                for (int j = 0; j < n; j++) {

                    if (nums[j] == current + 1) {
                        arr.add(nums[j]);
                        current = nums[j];
                        found = true;
                        break;
                    }

                }
            }

            bigArray.put(i, arr);
        }

        for (ArrayList<Integer> list : bigArray.values()) {
            largest = Math.max(largest, list.size());
        }

        return largest;
    }
}