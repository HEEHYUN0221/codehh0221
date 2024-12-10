import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] lostarr = new int[n+1];
        
        for(int i=0;i<n+1;i++){
                lostarr[i]=1;
        }
        
        for(int b=0;b<reserve.length;b++) {
            int num = reserve[b]-1;
            lostarr[num]++;
        }
        
        
        for(int a=0;a<lost.length;a++) {
            int num = lost[a]-1;
            lostarr[num]--;
        }
    
        
        for(int i=0;i<n;i++){
            if(lostarr[i]==0){
                if(i>0&&lostarr[i-1]==2){  
                    lostarr[i-1]-=1;
                    lostarr[i]+=1;
                    }
                else if(i<n-1&&lostarr[i+1]==2){
                    lostarr[i+1]-=1;
                    lostarr[i]+=1;
                }
                       
            }
            if(lostarr[i]==1||lostarr[i]==2){
                answer++;
            }
        }
        
    
        
        
        return answer;
    }
}