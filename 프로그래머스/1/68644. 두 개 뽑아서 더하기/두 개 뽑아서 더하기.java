import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        int add = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                add = numbers[i]+numbers[j];
                if (numList.indexOf(add) < 0) {
                    numList.add(add);
                }
            }
        }

        int[] answer = new int[numList.size()];
        for(int i = 0;i < answer.length;i++){
            answer[i] = numList.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}