import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);

            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                    stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 &&
                    stack.get(size - 1) == 1) {
                    
                    // 햄버거 완성 시 마지막 네 개 요소 제거
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    
                    answer++;
                }
            }
        }

        return answer;
    }
}