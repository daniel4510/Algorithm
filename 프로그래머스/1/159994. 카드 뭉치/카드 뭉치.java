class Solution {
    public  String solution(String[] cards1, String[] cards2, String[] goal) {
        int firstCard = 0;
        int secondCard = 0;

        for(int i = 0;i < goal.length;i++){
            if(firstCard < cards1.length && goal[i].equals(cards1[firstCard]))
                firstCard++;
            else if(secondCard < cards2.length && goal[i].equals(cards2[secondCard]))
                secondCard++;
            else
                return "No";
        }
        return "Yes";
    }
}

