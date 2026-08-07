class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // int[] sortedArr = new int[people.length];
        Arrays.sort(people);
        int l = 0;
        int r = people.length-1;
        int boat = 0;
        while(l <= r){
            int remain = limit - people[r];
            r--;
            boat++;
            if(l <= r && remain >= people[l]){
                l++;
            }
            
        }
        return boat;

        
    }
    
}