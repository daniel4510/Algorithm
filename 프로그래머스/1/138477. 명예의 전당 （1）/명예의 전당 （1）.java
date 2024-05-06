import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[k + 1];

        for (int i = 0; i < score.length; i++) {
            rank[0] = score[i];
            Arrays.sort(rank);
            if(i < k){
                answer[i] = rank[k - i];
            }else{
                
                answer[i] = rank[1];
            }
        }

        return answer;
    }
}