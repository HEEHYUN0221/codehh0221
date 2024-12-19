class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bable = {"aya","ye","woo","ma"};
       
        
        for(String b : babbling) {
            String bt=b;
            for(String a: bable) {
                b=b.replace(a,"*");
                System.out.println(b);
            }
            
            b=b.replace("*","");
            if(b.length()==0) {
                answer++;
            }
             
        }
        
        return answer;
    }
}