class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int count=0;
        if(arr.length-1==0){
            return new int[]{-1};
        }
        int[] answer = new int[arr.length-1];
        for(int i = 0;i<arr.length;i++){
               min = Math.min(min, arr[i]);
        }
        
        for(int i = 0;i<arr.length;i++){
                if(arr[i]!=min){
                    answer[count]=arr[i];
                    count++;
                }
        }
        
        return answer;
    }
}