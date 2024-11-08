class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int length = right-left+1;
        int temp=left;
        
        for(int i=0;i<length;i++){
            int cnt=0;
            for(int j=1;j<temp+1;j++){
                if(temp%j==0){
                    cnt++;
                }
            }
            System.out.println(cnt);
            if(cnt%2==0){
                answer += temp;
                System.out.println(temp);
                System.out.println(answer);
            }
            else{
                answer -= temp;
                System.out.println(temp);
                System.out.println(answer);
            }
            temp++;
        }
        return answer;
    }
}