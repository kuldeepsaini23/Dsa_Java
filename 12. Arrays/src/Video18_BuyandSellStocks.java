import java.util.Scanner;

public class Video18_BuyandSellStocks {

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i< prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] prices = new int[6];
        for (int i=0; i<prices.length; i++){
            System.out.print("Enter your array value = ");
            prices[i] = in.nextInt();
        }

        System.out.println("The maximum profit is: " + buyAndSellStocks(prices));
    }
}
