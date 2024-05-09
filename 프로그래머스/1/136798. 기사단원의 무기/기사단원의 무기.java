class Solution {
    public static int solution(int number, int limit, int power) {
        int cnt;
        int weight = 0;
        for(int i = 1;i <= number;i++){
            cnt = 0;
            for(int j = 1;j * j <= i;j++){
                if(j * j == i)
                    cnt++;
                else if (i % j == 0)
                    cnt += 2;
            }
            if(cnt > limit)
                weight += power;
            else
                weight += cnt;
        }

        return weight;
    }
}