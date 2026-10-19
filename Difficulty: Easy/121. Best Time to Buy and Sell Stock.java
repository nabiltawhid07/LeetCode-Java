class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit=0;
        int lowestPrice=prices[0];
        int profit=0;
        int price=0;
        for(int i=0;i<prices.length;i++){
            price=prices[i];
            profit=prices[i]-lowestPrice;
            if(profit>MaxProfit){
                MaxProfit=profit;c
            }
            if(price<lowestPrice){
                lowestPrice=price;
            }
        }
        if(MaxProfit<0){
            MaxProfit=0;
        }
        return MaxProfit;
    }
}

//More efficient version, O(n) time complexity only
// Used 1 loop instead on nested loops.
