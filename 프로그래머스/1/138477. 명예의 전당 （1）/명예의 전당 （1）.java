import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
    
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < Math.min(k,score.length); i++) {
            minHeap.add(score[i]);
            answer[i] = minHeap.peek(); 
        }
        
        for (int i = k; i < score.length; i++) {
            if (!minHeap.isEmpty()&&score[i] > minHeap.peek()) {
                minHeap.poll(); 
                minHeap.add(score[i]); 
            }
            answer[i] = minHeap.peek(); 
        }
        
        return answer;
    }
}