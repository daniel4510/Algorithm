class Solution {
    public int[] solution(long n) {
        String word = n + "";
        int[] answer = new int[word.length()];
        for (int i = 0; n != 0 ;i++){
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}