import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> numList = new ArrayList<>();
        for(int i = 0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++){
                    numList.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        for(int a : numList) {
            int cnt =0;
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0) {
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
                answer++;
            }
            
        }
        
        return answer;
    }
}