class Solution {
    public List<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();


        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > (nums.length)/3){
                arr.add(entry.getKey());
            }

        }
        return arr;
    }
}