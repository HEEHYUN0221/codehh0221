import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> score = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                if(score.containsKey(person)) {
                    sum += score.get(person);
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}

// 각 사람의 그리움 점수를 더함
// 사람 name, 점수 yearning / 각 사진에 찍힌 인물의 이름들 photo
// photo에 이중반복문을 써서 이름을 찾고 각 점수를 더해 배열에 저장한다. 
// 이름은 중복될 수 없으니까 Map 사용
