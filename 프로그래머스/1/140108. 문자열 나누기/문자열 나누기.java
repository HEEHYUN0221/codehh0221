import java.util.*;
class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        
       List<String> list = new ArrayList<>();
        
        while(true){ 
            int cnt1=0;//있을때
            int cnt0=0;//없을때
            for(int i =0;i<s.length()-1;i++) {
            if(x==s.charAt(i)){
                cnt1++;
            } else {
                cnt0++;
            }
            if(cnt1==cnt0){
                list.add(s.substring(0,i+1));
                s=s.substring(i+1);
                x=s.charAt(0);
                break;
            } 
            }
            if(s.length()<=2||cnt1!=cnt0){
                list.add(s);
                break;
            }
        }
      
        return list.size();
    }
}