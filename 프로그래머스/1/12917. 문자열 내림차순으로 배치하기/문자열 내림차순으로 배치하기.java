import java.nio.charset.StandardCharsets;
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        
        byte temp;
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        for(int i =0;i<bytes.length;i++){
            for(int j=0;j<bytes.length;j++){
                if(bytes[i]>bytes[j]){
                    temp = bytes[j];
                    bytes[j]=bytes[i];
                    bytes[i]=temp;
                }
            }
        }
          
        return new String(bytes,StandardCharsets.UTF_8);
    }
}