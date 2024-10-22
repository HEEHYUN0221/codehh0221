class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long result=0;
        long longx = Long.valueOf(x);
        for(int i = 0; i<n; i++) {
            answer[i]=longx+result;
            result +=longx;
        }
        return answer;
    }
}