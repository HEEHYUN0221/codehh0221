import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] cnt = new int[2];
        for(int i=0;i<lottos.length;i++) {
            if(lottos[i]!=0){
                for(int j=0;j<win_nums.length;j++) {
                if(lottos[i]==win_nums[j]) {
                    cnt[1]++;
                    break;
            }
            }}else {
                    cnt[0]++;
                }
        
        } 
        cnt[0]+=cnt[1];
        int[] answer= new int[2];
        for(int i =0; i<cnt.length;i++){
            System.out.println(cnt[i]);
            switch(cnt[i]) {
            case 0,1 -> {answer[i]=6; break;}
            case 2 -> {answer[i]=5; break;}
            case 3 -> {answer[i]=4; break;}
            case 4 -> {answer[i]=3; break;}
            case 5 -> {answer[i]=2; break;}
            case 6 -> {answer[i]=1; break;}
        }
        }
        
      
        return answer;
    }
}