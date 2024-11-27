class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int surplus = 0;
        do {
            answer+=(n/a)*b;
            n=(n/a)*b+(n%a);
        }while(n>=a);
        return answer;
    }
}