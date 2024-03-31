class Solution {
    boolean solution(String s) {
        int pNum = 0,yNum = 0;

        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 80 || s.charAt(i) == 112)
                pNum++;
            else if (s.charAt(i) == 89 || s.charAt(i) == 121)
                yNum++;
        }

        return pNum == yNum;
    }
}