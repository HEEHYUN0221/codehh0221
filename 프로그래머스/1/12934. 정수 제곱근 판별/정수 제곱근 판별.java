class Solution {
    public long solution(long n) {
        long answer = 0;
        long result = 0;
        result = (long) Math.sqrt(n);
        if(Math.pow(result,2)==n) {
            answer = (long) Math.pow(result+1,2);
        }
        else {
            answer = -1;
        }
        
        return answer;
    }
}