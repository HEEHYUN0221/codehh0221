import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for(int a : score) {
            maxHeap.add(a);
        }
        while(maxHeap.size() >=m) {
            List<Integer> box = new ArrayList<>();
            for(int i=0;i<m;i++){
                box.add(maxHeap.poll());
            }
            int min = Collections.min(box);
            answer +=min*m;
          }   
            return answer;
        
    }
}