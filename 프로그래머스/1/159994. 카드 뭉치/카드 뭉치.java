import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Deque<String> deque = new ArrayDeque();
        Deque<String> deque2 = new ArrayDeque();
        Deque<String> answer = new ArrayDeque();
        for(String a : cards1) {
            deque.addLast(a);
        }
        for(String b : cards2) {
            deque2.addLast(b);
        }
        for(String c : goal) {
            answer.addLast(c);
        }
        
        for(int i = 0;i<goal.length;i++) {
             String cd = answer.pollFirst();
            if(cd.equals(deque.peekFirst())){
                deque.pollFirst();
            } else if (cd.equals(deque2.peekFirst())){
                deque2.pollFirst();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}