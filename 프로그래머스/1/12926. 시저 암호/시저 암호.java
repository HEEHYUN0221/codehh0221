
import java.util.Arrays;
class Solution {
    public String solution(String s, int n) {
        char[] an = s.toCharArray();
        for(int i=0;i<an.length;i++) {
            if(an[i]>=65&&an[i]<=90){
                if((an[i]+n)>90){
                    
                    an[i]=(char) ((n+an[i])%90+64);
                }
                else{
                    an[i]=(char) (n+an[i]);
                }
                
                System.out.println(an[i]);
            }    
            if(an[i]>=97&&an[i]<=122){
                if((an[i]+n)>122){
                    an[i] = (char) ((n+an[i])%122+96);
                }
                else{
                    an[i]=(char) (n+an[i]);
                }
            }
        }
        return String.valueOf(an);
    }
}
//65A 90Z 97a 122z