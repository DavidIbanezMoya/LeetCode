package Top100.Greedy;

public class Main {
    public static void main(String[] args) {
        /*BestBuyAndSellStock sellStock = new BestBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        sellStock.maxProfit(prices);*/
        JumpGame jumpGame = new JumpGame();
        int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};
        System.out.println(jumpGame.canJump(nums));
    }

}
