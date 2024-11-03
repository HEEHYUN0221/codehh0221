import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String[] result = phone_number.split("");
        System.out.println(Arrays.toString(result));
        for(int i = 0; i<length-4;i++){
            result[i] = "*";
        }
        return  String.join("", result);
    }
}