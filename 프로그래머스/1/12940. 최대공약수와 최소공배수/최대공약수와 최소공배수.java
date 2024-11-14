class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int mulnm=n*m;
        int temp=0;
        if(n>m){
            temp  = n;
            n = m;
            m = temp;
        }     
        
        while(n!=0){
            temp = m%n;
            if(temp==0){
                answer[0]=n;
                break;
            }
            m=n;
            n=temp;
        }//최대 공약수
        answer[1]=mulnm/n;//최소 공배수
        
        
        return answer;
    }
}