class Solution {
    public int solution(int[] nums) {
        int cnt = 0;
        boolean isPrime = true;
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                for(int k = j + 1;k < nums.length;k++){
                    isPrime = true;
                    for(int m = 2;m < nums[i] + nums[j] + nums[k];m++){
                        if((nums[i] + nums[j] + nums[k]) % m == 0){
                            isPrime = false;
                        }
                    }
                    if(isPrime)
                        cnt++;
                }
            }
        }

        return cnt;
    }
}