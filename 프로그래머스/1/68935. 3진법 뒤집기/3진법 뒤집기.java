class Solution {
    public static int solution(int n) {
        int num = n;
        int length = 0;
        while(true){
            if(num/3 == 0){
                length++;
                break;
            }
            num /= 3;
            length++;
        }
        int[] threeNum = new int[length];

        for(int i = length -1;i >= 0;i--){
            threeNum[i] = n % 3;
            n /= 3;
        }
        int sum = 0, mul = 1;
        for (int i = 0;i < length;i++){
            sum += threeNum[i] * mul;
            mul *= 3;
        }
        

        return sum;
    }
}