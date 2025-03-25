import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        String[] mString = myString.split("");
        int cnt = 0;
        for(String s : mString) {
            if(s.equals("x")) {
                answer.add(cnt);
                cnt = 0;
                continue;
            }
            cnt++;
        }
        answer.add(cnt);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}