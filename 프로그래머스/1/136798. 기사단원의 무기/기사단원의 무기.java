import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        
        List<Integer> list = new ArrayList<>();
         //처음에 NUMBER의 약수의 개수를 구해야함

        for(int i=1;i<=number;i++){
        int cnt = 0;
        for(int j=1;j<=(int) Math.sqrt(i);j++){
        if(i%j==0){
        cnt ++;
            if(j!=i/j){
                cnt++;
            }
        }
        }
        list.add(cnt);
            System.out.println(cnt);
        }
        
         //약수가 limit을 넘으면 powe로 바꿈
        for(int i=0;i<list.size();i++){
        if(list.get(i)>limit) {
        list.set(i,power);
        }
        }
        
        int answer = 0;
        for(int a : list) {
            answer+=a;
        }
        
        
        return answer;
    }
}