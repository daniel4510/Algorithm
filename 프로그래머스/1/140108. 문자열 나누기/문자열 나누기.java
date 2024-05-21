class Solution {
    public static int solution(String s) {
        int answer = 0;
        int x = 0;
        int anotherX = 0;
        int xAscii = 0;
        boolean start = true;

        for(int i = 0;i < s.length();i++){
            if(start){
                xAscii = s.charAt(i);
                start = false;
            }

            if(xAscii == s.charAt(i))
                x++;
            else
                anotherX++;

            if(x == anotherX){
                answer++;
                x = 0;
                anotherX = 0;
                start = true;
            }
        }
        
        if(x != anotherX)
            answer++;

        return answer;
    }
}