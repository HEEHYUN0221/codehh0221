import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
       List<Integer> sc = new ArrayList<>();
        List<Integer> box = new ArrayList<>();
        int answer = 0;
        
        for(int a : score) {
            sc.add(a);
        }
        
        while(sc.size()>=m){
            for(int i = 0; i<m;i++) {
            box.add(Collections.max(sc));
            sc.remove(Collections.max(sc));
            }
        int min = Collections.min(box);
        
            answer +=min*m;
            box.clear();
        }
        
        
        return answer;
    }
}