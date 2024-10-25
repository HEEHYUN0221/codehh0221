class Solution {
    public long solution(long n) {
        long answer = 0;
        int length = (int) (Math.log10(n)+1);
        long []a = new long[length];
        for(int i=length-1;i>=0;i--){
            a[i] = (n%10);
            n/=10;
            System.out.println(a[i]);
        }
        for (int i = 0; i < length; i++) {
            for(int j = i+1; j < length; j++) {
                if(a[i]<a[j]){
                    long temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i<length; i++) {
            answer = answer*10 + a[i];
        }
        return answer;
    }
}
