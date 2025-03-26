import java.util.*;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //video_len 비디오 길이, pos 현재위치
        String[] posStr = pos.split(":");
        String[] videoStr = video_len.split(":");
        String[] op_startStr = op_start.split(":");
        String[] op_endStr = op_end.split(":");
        int posms = Integer.parseInt(posStr[0]) * 60 + Integer.parseInt(posStr[1]);
        int video_lenms = Integer.parseInt(videoStr[0]) * 60 + Integer.parseInt(videoStr[1]);
        int op_startms = Integer.parseInt(op_startStr[0]) * 60 + Integer.parseInt(op_startStr[1]);
        int op_endms = Integer.parseInt(op_endStr[0]) * 60 + Integer.parseInt(op_endStr[1]);
        System.out.println(posms);
        
        for(String com : commands) {
             if(com.equals("next")) {
                if(posms <= op_endms && posms >= op_startms) {
                    posms = Math.min(op_endms + 10, video_lenms);
                } else if(posms + 10 <= op_endms && posms + 10 >= op_startms) {
                    posms = Math.min(op_endms, video_lenms);
                }
                 else {
                    posms = Math.min(posms + 10, video_lenms);
                }
            } else if(com.equals("prev")){
                 if(posms - 10 <= op_endms && posms - 10 >= op_startms) {
                     posms = Math.min(op_endms, video_lenms);
                 }
                else if(posms - 10 <= 0) {
                    posms = 0;
                } else {
                    posms -= 10;
                }
            }
            System.out.println(posms);
        }
        String posm = posms / 60 < 10? "0" + (posms / 60) : (posms / 60) + "";
        String poss = posms % 60 < 10? "0" + (posms % 60) : (posms % 60) + "";
        
        
        return posm + ":" + poss;
    }
}