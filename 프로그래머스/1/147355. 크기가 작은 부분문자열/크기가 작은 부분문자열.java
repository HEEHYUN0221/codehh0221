class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        long pint = Long.parseLong(p);
        
        for(int i =0;i<=t.length()-plen;i++){
            String str = t.substring(i,i+plen);
            long tvalue = Long.parseLong(str);
            if(tvalue<=pint){
                answer++;
            }
        }
            
        return answer;
    }
}