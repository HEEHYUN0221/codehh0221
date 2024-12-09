import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 발음 가능한 단어 배열
        String[] babble = {"aya", "ye", "woo", "ma"};
        
        // 각 단어를 검사
        for (String a : babbling) {
            boolean isValid = true; // 유효성 검사용 플래그
            String previous = ""; // 이전 발음을 저장
            
            while (!a.isEmpty()) { // 문자열이 비어질 때까지 반복
                boolean matched = false; // 현재 위치에서 발음 가능한 단어를 찾았는지 여부
                
                for (String sound : babble) {
                    if (a.startsWith(sound)) { // 현재 단어가 sound로 시작하는지 확인
                        if (sound.equals(previous)) { // 이전 발음과 같으면 유효하지 않음
                            isValid = false;
                            break;
                        }
                        previous = sound; // 이전 발음을 업데이트
                        a = a.substring(sound.length()); // 현재 발음 제거
                        matched = true;
                        break;
                    }
                }
                
                if (!matched) { // 어떤 발음도 매칭되지 않으면 유효하지 않음
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) { // 유효한 단어라면 카운트 증가
                answer++;
            }
        }
        
        return answer; // 결과 반환
    }
}