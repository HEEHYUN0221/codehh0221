import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> an = new ArrayList<>();
        for(int i =0;i<numbers.length;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                int sum = numbers[i]+numbers[j];
                if(!an.contains(sum)){
                    an.add(sum);
                }
            }
        }
        
        
        return an.stream().mapToInt(i->i).sorted().toArray();
    }
}