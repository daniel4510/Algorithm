class Solution {
    public long solution(int price, int money, int count) {
        long result = -1;
        long myMoney = money;
        for (int i = 1;i <= count;i++){
            myMoney -= price * i;
        }

        if(myMoney >= 0)
            result = 0;
        else{
            result = Math.abs(myMoney);
        }

        return result;
    }
}