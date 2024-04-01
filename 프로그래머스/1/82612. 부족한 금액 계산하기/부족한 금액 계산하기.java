class Solution {
    public long solution(int price, int money, int count) {
        long result = -1;
        long myMoney = money;
        for (int i = 1;i <= count;i++){
            myMoney -= (long) (price * i);
        }
        
        return myMoney >= 0? 0 : Math.abs(myMoney);
    }
}
