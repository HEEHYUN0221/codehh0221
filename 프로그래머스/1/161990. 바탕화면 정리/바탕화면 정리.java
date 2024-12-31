import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minx=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        int rowLength = wallpaper.length;
        int miny=Integer.MAX_VALUE;
        int maxy=Integer.MIN_VALUE;
        for(int i=0;i<rowLength;i++){
            String s = wallpaper[i];
            if(s.contains("#")){
                miny=Math.min(i,miny);
                maxy=Math.max(i,maxy);
                
                minx=Math.min(minx, s.indexOf("#"));
                maxx=Math.max(maxx, s.lastIndexOf("#"));
            }
           
        }
        
        answer[0]=miny;
        answer[1]=minx;
        answer[2]=maxy+1;
        answer[3]=maxx+1;
        
        
        return answer;
    }
}