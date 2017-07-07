package algs.test;

/**
 * Created by Nico on 7/4/17 19:26.
 */
public class Test {

    public static void main(String[] args) {
//        int[] price = {5, 3, 2, 4, 6, 3};
        int[] price = {5, 10, 2, 11, 0, 10};
        int profitN = profitN(price);
        System.out.println(profitN);

        int profit = profit(price);
        System.out.println(profit);
    }

    static int profitN(int[] price) {
        int profit = 0;
        int status = 0;

        for (int i = 0; i < price.length - 1; i++) {
            if (price[i + 1] > price[i]) {
                if (status == 0) {
                    status = 1;
                }
                profit += price[i + 1] - price[i];
            } else if (price[i + 1] < price[i] && status == 1) {
                status = 0;
            }
        }
        return profit;
    }

    static int profit(int[] price) {
        int profit = 0;
        int low = 0;
        int high = findMax(price, 0);
        int maxProfit = price[high] - price[low];
        for (int i = 0; i < price.length - 1; i++) {
            if (i < high && price[i] <= price[low]) {
                low = i;
            }
            if (i >= high) {
                low = i + 1;
                high = findMax(price, low);
            }
            profit = price[high] - price[low];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    static int findMax(int[] price, int from) {
        int high = from;
        int max = price[from];
        for (int i = from; i < price.length; i++) {
            if (price[i] >= max) {
                high = i;
                max = price[high];
            }
        }
        return high;
    }
}
