class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];
        String bin = "";
        
        //첫번째 배열 정리
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n;j++){
                bin += arr1[i] % 2;
                arr1[i] /= 2;
            }
            strArr1[i] = bin;
            bin = "";
        }
        //두번째 배열 정리
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n;j++){
                bin += arr2[i] % 2;
                arr2[i] /= 2;
            }
            strArr2[i] = bin;
            bin = "";
        }
        
        //비교하고 answer 배열 완성하기 (비밀지도 완성)
        for(int i = 0;i < n;i++){
            for(int j = n-1;j >= 0;j--){
                if(strArr1[i].charAt(j) == '1' || strArr2[i].charAt(j) == '1'){
                    bin += "#";
                }else{
                    bin += " ";
                }
            }
            answer[i] = bin;
            bin = "";
        }
        
        return answer;
    }
}