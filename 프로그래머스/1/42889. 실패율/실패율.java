class Solution {
    public static int[] solution(int N, int[] stages) {
        double[] percent = new double[N + 1];
        int[] clear = new int[N + 1];
        int[] noClear = new int[N + 1];
        int[] answer = new int[N];

        for(int stage : stages){
            for(int i = 0;i <= stage;i++){
                if(stage == i)
                    noClear[stage - 1]++;
                else
                    clear[i]++;
            }
        }

        for(int i = 0;i < N;i++){
            percent[i] = (double) noClear[i] / clear[i];
            if(clear[i] == 0)
                percent[i] = 0;
        }

        double max = 0;
        int target = 1;
        for (int i = 0; i < N; i++) {
            max = percent[0];
            target = 1;
            for (int j = 0; j < percent.length; j++) {
                if (percent[j] > max) {
                    max = percent[j];
                    target = j + 1;
                }
            }
            percent[target - 1] = -1;
            answer[i] = target;
        }

        return answer;
    }
}