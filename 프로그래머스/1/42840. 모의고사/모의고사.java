import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        List<Integer> answerlist = new ArrayList<>();
        
        for(int i=0;i<answers.length;i++) {
            int j=i%one.length;
            if(answers[i]==one[j]){cnt1++;}
            j=i%two.length;
            if(answers[i]==two[j]){cnt2++;}
            j=i%three.length;
            if(answers[i]==three[j]){cnt3++;}
        }
        int max = Math.max(cnt1,Math.max(cnt2,cnt3));
        if(max == cnt1) answerlist.add(1);
        if(max == cnt2) answerlist.add(2);
        if(max == cnt3) answerlist.add(3);
        
        int[] answer = new int[answerlist.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i]=answerlist.get(i);
        }
        
        
        return answer;
    }
}