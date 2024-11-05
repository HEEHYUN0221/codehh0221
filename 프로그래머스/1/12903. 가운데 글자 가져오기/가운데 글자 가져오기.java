class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length%2==0){
            length/=2;
            answer = s.substring(length-1,length+1);
            System.out.println(answer);
        }
        else {
            length=(int) (length/2);
            answer = s.substring(length,length+1);
            System.out.println(answer);
        }
        return answer;
    }
}