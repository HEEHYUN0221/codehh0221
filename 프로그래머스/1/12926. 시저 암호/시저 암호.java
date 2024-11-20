
import java.util.stream.Collectors;
class Solution {
    public String solution(String s, int n) {
     return s.chars()
                .mapToObj(c -> {
                    if(c>='a'&&c<='z'){
                        return (char)((c+n-'a')%26+'a');
                    } else if(c>='A'&&c<='Z'){
                        return (char)((c+n-'A')%26+'A');
                    } else {
                        return (char)c;
                    }
                }).map(String::valueOf)
                .collect(Collectors.joining());
}
}
//65A 90Z 97a 122z