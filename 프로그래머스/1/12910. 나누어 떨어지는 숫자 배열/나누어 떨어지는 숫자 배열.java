import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int length = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<length;i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        Collections.sort(list);
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}