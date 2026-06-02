class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];                //assuming the first day is min 
        int maxProfit = 0;                     

        for (int i = 1; i < prices.length; i++) {      //finding minPrice and maxProfit     

            if (prices[i] < minPrice) {          //if day1 price is less than minimum
                minPrice = prices[i];           //update minimum
            }

            else {                             //if not

                int profit = prices[i] - minPrice;     //the difference is the profit

                if (profit > maxProfit) {               //if profit is more then max profit
                    maxProfit = profit;                 //update maxprofit
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {          //main function

        int[] prices = {8, 2, 4, 4, 7, 5};

        int ans = maxProfit(prices);                 //function calling

        System.out.println("Maximum Profit: " + ans);
    }
}