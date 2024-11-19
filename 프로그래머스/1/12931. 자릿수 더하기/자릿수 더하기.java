import java.util.*;

public class Solution {
    public int solution(int n) {
        return String.valueOf(n).chars().map(Character::getNumericValue).sum();
    }
}//n을 String으로 바꿈 -> 각 문자를 IntStream으로 변환 -> 각 문자를 숫자로 변환 -> 합계 계산