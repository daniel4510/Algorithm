class Solution {
    public static String solution(int[] food) {
        String answer = "";

        for(int i = 1;i < food.length;i++){
            for (int j = 0;j < food[i] / 2;j++){
                answer += i;
            }
        }
        System.out.println(answer);
        StringBuilder sb = new StringBuilder(answer);
        String answer2 = sb.reverse().toString();

        return answer + '0' + answer2;
    }
}