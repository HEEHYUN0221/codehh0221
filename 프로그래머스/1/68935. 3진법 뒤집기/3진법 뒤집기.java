import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int origin = n;
        int thr = 1;
        ArrayList<Integer> temp = new ArrayList<>(); 
        while(n>=1){
            temp.add(n%3);
            n=n/3;
            System.out.println(temp);
        }
        while(!temp.isEmpty()){
            answer += temp.remove(temp.size()-1)*thr;
            thr*=3;
        }
        return answer;
    }
}