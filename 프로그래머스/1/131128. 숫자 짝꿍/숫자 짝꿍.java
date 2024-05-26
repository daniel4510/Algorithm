class Solution {
    public static String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] xNum = new int[10];
        int[] yNum = new int[10];

        for(char num : X.toCharArray()){
            xNum[num - '0']++;
        }
        for(char num : Y.toCharArray()){
            yNum[num - '0']++;
        }

        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < Math.min(xNum[i], yNum[i]); j++) {
                sb.append(i);
            }
        }

        answer = sb.toString();
        
        if(answer.length() == 0) {
            answer = "-1";
            return answer;
        }
        
        if(answer.charAt(0) == '0') {
            answer = "0";
        }

        return answer;
    }
}