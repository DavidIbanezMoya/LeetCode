package Top100.Greedy;

public class Main {
    public static void main(String[] args) {
        BestBuyAndSellStock sellStock = new BestBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        sellStock.maxProfit(prices);
    }

}
