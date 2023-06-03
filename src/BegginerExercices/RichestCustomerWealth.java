package BegginerExercices;

import java.util.Comparator;
import java.util.LinkedList;

public class RichestCustomerWealth {

    /*A customer's wealth is the amount of money they have in all their bank accounts.
    The richest customer is the customer that has the maximum wealth.*/

    public static void main(String[] args) {
        int[][] accounts = {
                {100, 200, 300},
                {10, 600, 25}
        };
        maximumWealth(accounts);
    }

    public static int maximumWealth(int[][] accounts) {
        LinkedList<Integer> customerWealth = new LinkedList<Integer>();
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            customerWealth.add(wealth);
        }
        customerWealth.sort(Comparator.reverseOrder());
        return customerWealth.get(0);
    }
}
