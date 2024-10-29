class Solution {
    public int solution(int num) {
        int answer = 0;
        long x = (int) num;
        int cnt = 0;
        if(num>1&&num<8000000){ 
            while(x!=1&&cnt<500){
            if(x%2==0){
                x/=2;
                cnt++;
            }
            else{
                x=x*3+1;
                cnt++;
            }
        }
        }
        else if(num==1){
            answer = 0;
        }
        answer = (cnt>=487)?-1:cnt;
       
        return answer;
    }
}