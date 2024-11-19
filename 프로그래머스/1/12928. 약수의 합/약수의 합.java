import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        return IntStream.rangeClosed(1,n).filter(x->n%x==0).sum();
    }
}