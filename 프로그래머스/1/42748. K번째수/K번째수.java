import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i =0; i<commands.length;i++) {
            int a[] = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
            int index = commands[i][2] -1 ;
            answer[i] = a[index];
        }
        return answer;
    }
}