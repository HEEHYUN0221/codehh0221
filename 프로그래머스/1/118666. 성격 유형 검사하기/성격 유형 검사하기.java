import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        
        Map<Character,Integer> result = new HashMap<>();
        
        for(int i=0;i<choices.length;i++) {
            int choice = choices[i];
            
            if(choice<=3){
                char type1 = survey[i].charAt(0);
                choice= -1*(choice-4);
                
                if(!result.containsKey(type1)){
                    result.put(type1,choice);
                } else {
                    int c = result.get(type1);
                    c+=choice;
                    result.put(type1,c);
                    System.out.println(result.get(type1));
                } 
                
            } else if(choice >=5){
                char type2 = survey[i].charAt(1);
                choice = choice-4;
                
                if(!result.containsKey(type2)){
                    result.put(type2,choice);
                } else {
                    int c = result.get(type2);
                    c+=choice;
                    result.put(type2,c);
                } 
                
            }  
            
        }
        
        char rt = (result.getOrDefault('R',0)>=result.getOrDefault('T',0))?'R':'T';
        char cf = (result.getOrDefault('C',0)>=result.getOrDefault('F',0))?'C':'F';
        char mj = (result.getOrDefault('M',0)>result.getOrDefault('J',0))?'M':'J';
        char an = (result.getOrDefault('A',0)>=result.getOrDefault('N',0))?'A':'N';
        
        return ""+rt+cf+mj+an;

    }
}