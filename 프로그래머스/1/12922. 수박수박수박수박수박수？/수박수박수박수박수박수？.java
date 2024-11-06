class Solution {
    public String solution(int n) {
        String answer = "수";
        for(int i =0;i<n-1;i++){ 
             if (answer.charAt(answer.length() - 1) == '수') {
                answer += "박";
            } else {
                answer += "수";
            }
        }
        return answer;
    }
}