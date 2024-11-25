import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        int[] answer = new int[s.length()];
        for(int i =0; i<s.length();i++) {
            int index=0;
            for(int j=i;j>=0;j--){
                if(j!=i&&str[i].equals(str[j]))
                {
                    answer[i]=i-j;
                    break;
                } else {
                    answer[i]=-1;
                }
            }
        }
        return answer;
    }
}