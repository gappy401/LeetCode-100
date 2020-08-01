public class Stock {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) { // keep getting the minimum on
            //the way and at the same tome look for the max profit if > min stock
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
    }
    public static void main(String args[])
    {
        Stock c = new Stock();
        int sums[]={0,1,12,34,5,6,89};
        int arr=c.maxProfit(sums);
        System.out.println(arr);
    }
}