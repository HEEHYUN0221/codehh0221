import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        
        //skip에 있는 문자
        for(int i=0;i<skip.length();i++) {
            char c = skip.charAt(i);
            skipSet.add(c);
        }
   
        //s의 한글자씩 생각.
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            int cnt =0;
            int tempindex=index;
           for(int j=1;j<tempindex+1;j++){
               char tempc = (char)(((c-'a' + j)%26)+'a');
               if(skipSet.contains(tempc)){
                   cnt++;
                   tempindex++;
               }
           }
            System.out.println(cnt);
           answer.append((char) ((c - 'a' + index + cnt) % 26 + 'a'));
            
        }

        return answer.toString();
    }
}