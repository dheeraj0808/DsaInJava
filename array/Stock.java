public class Stock {
    public static int BuyandSellStock(int price[]){
       int buyPrice=Integer.MAX_VALUE;
       int maxProfit =0;
       for(int i=0;i<price.length;i++){
        if(buyPrice<price[i]){
            int profit=price[i]-buyPrice;
            maxProfit=Math.max(maxProfit, profit);
        }else{
            buyPrice=price[i];
        }

       }
       return maxProfit;

    }
    public static void main(String args[]){
        int price[]={7,5,4,3,2,1,0,2};
      System.out.println("maximum profit is " +  BuyandSellStock(price));
    }
    
}
