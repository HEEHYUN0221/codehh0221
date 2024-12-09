import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] xar = new int[10];//빈도수저장
        int[] yar = new int[10];
        
        for(char a : X.toCharArray()) {
            xar[a-'0']++;
        }
        for(char b : Y.toCharArray()) {
            yar[b-'0']++;
        }
        
        StringBuilder result = new StringBuilder();
        for(int i=9;i>=0;i--){
            int cnt = Math.min(xar[i],yar[i]);
            if(cnt!=0){
                for(int j=0;j<cnt;j++){
                    result.append(i);
                } 
            }
        }
        
        if(result.length()==0) {
            return "-1";
        }
        
        if(result.charAt(0)=='0'){
            return "0";
        }
    
        
        return result.toString();
        
}
}