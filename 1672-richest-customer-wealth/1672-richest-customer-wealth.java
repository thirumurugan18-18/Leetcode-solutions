class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int money : customer) {
                sum += money;
            }
            rich = Math.max(rich, sum);
        }
        return rich;
    }
}  