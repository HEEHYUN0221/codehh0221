class Solution {
    public int[] solution(long n) {
        long length = n;
        int count = 0;
        
        while(length>=1) {
            length/=10;
            count++;
        }
        
        int[] answer = new int[count];
        
        for(int i=0;i<count;i++) {
            answer[i] = (int) (long) (n%10);
            n/=10;
        }
        
        return answer;
    }
}