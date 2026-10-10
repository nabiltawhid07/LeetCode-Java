class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=i+1;
        int MaxProfit=0;
        if(prices.length==0 || prices.length==1){  //edge case handling
            MaxProfit=0;
        }
        else{   //general case handling
         MaxProfit=prices[j]-prices[i];
        for(i=0;i<prices.length-1;i++){
            for(j=i+1;j<prices.length;j++){
                int MaxProfit2=prices[j]-prices[i];
                if(MaxProfit2>MaxProfit){
                    MaxProfit=MaxProfit2;
                }
            }
        }
        if(MaxProfit<=0){
            MaxProfit=0;
        }
        }
        
        return MaxProfit;
    }
}
