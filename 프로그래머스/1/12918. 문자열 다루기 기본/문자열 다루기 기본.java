import java.nio.charset.StandardCharsets;
import java.util.Arrays;
class Solution {
    public boolean solution(String s) {
        if(s.length()!=4&&s.length()!=6){return false;}
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        for(int i =0;i<bytes.length;i++){
           if((bytes[i]>=65&&bytes[i]<=90)||(bytes[i]>=97&&bytes[i]<=122)){
               return false;
           } 
        }
        
        return true;
    }
}