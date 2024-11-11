
class Solution {
    public boolean solution(String s) {
        int length = s.length();
        if(length!=4&&length!=6){return false;}
        char[] c = s.toCharArray();
        for(int i =0;i<c.length;i++){
           if((c[i]>='a'&&c[i]<='z')||(c[i]>='A'&&c[i]<='Z')){
               return false;
           } 
        }
        
        return true;
    }
}