class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        int prof = 0;

        for(int i = 0; i < l-1 ; i++ ){
            if((prices[i+1] - prices[i])>0){
                    prof = prof +(prices[i+1] - prices[i]);

            }

        }
        return prof;
                        
    }
}