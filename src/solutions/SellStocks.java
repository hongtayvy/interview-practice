package solutions;

public class SellStocks {
    /**
     * If this takes in [7,1,5,3,6,4] one cycle will look like:
     *
     * lowestStockPrice = 7
     * currentProfit = 7(current index) - 7(lowest stock price)
     * overallProfit = 0 so we do no switch the value.
     *
     * Solution Run looks like:
     * lowestStockPrice = 1
     * currentProfit = 6(current index) - 1(lowest stock price)
     * overallProfit is currently 4.
     * overallProfit less than currentProfit which is 5 so we switch overallProfit to 5.
     * @param prices
     */
    public static void runSellStocks(int [] prices){
        //Default to max integer value
        int lowestStockPrice = Integer.MAX_VALUE;

        //Over profit will be the price minus the lowest stock price.
        int overallProfit = 0;

        //Current profit will be the calculation amount of the current price - lowest stock price
        int currentProfit = 0;

        for (int price : prices) {

            //We find the lowest stock option here. If the price is less than the current lowest stock price we'll set the lowest stock price to that value.
            if (price < lowestStockPrice) {
                lowestStockPrice = price;
            }

            //We now calculate the current profit which will take the price - the lowest stock price
            currentProfit = price - lowestStockPrice;

            //If the overall profit is less than the current profit we, then we now set the overall profit to the current profit.
            if (overallProfit < currentProfit) {
                overallProfit = currentProfit;
            }
        }

        System.out.println(overallProfit);
    }
}
