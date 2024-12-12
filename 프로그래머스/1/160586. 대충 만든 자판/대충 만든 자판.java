import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // 각 문자의 최소 키 입력 횟수를 저장하는 Map 생성
        Map<Character, Integer> keyPressMap = new HashMap<>();
        
        // keymap을 순회하며 각 문자의 최소 입력 횟수 계산
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                // 기존 값과 비교하여 더 작은 값을 저장
                keyPressMap.put(c, Math.min(keyPressMap.getOrDefault(c, Integer.MAX_VALUE), i + 1));
            }
        }
        
        // targets 배열을 순회하며 각 문자열의 최소 입력 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPresses = 0;
            
            for (char c : target.toCharArray()) {
                // 문자가 keymap에 없는 경우
                if (!keyPressMap.containsKey(c)) {
                    totalPresses = -1;
                    break;
                }
                totalPresses += keyPressMap.get(c);
            }
            
            answer[i] = totalPresses;
        }
        
        return answer;
    }
}