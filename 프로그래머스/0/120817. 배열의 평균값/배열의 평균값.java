import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}