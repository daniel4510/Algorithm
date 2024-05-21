class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct = 0;
        int zero = 0;
        for(int num : lottos){
            if(num == 0){
                zero++;
            }else{
                for(int win : win_nums){
                    if(num == win)
                        correct++;
                }
            }
        }

        answer[0] = 1 + (6 - (correct + zero));
        answer[1] = 1 + (6 - (correct));

        if(correct + zero <= 1)
            answer[0] = 6;
        if(correct <= 1)
            answer[1] = 6;
        return answer;
    }
}