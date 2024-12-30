class Solution {
    public int solution(int number, int n, int m) {
        System.out.println(number%n);
        if(number%n==0&&number%m==0){
            return 1;
        }
        return 0;
    }
}