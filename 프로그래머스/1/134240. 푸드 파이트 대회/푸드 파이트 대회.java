import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i=food.length-1;i>=0;i--) {
            if(i==0) {
                answer.insert(answer.length()/2,0);
            }
            else if(food[i]/2<1) 
                continue;
           
            else {
                for(int j=0;j<food[i]/2;j++){
                    answer.insert(0,i);
                    answer.insert(answer.length(),i);
            }
         }
    }
                
        
        return answer.toString();
    }
}