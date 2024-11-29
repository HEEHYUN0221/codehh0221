import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);
        DayOfWeek day = date.getDayOfWeek();
        switch(day.getValue()) {
            case 1 : return "MON";
            case 2 : return "TUE";
            case 3 : return "WED";
            case 4 : return "THU";
            case 5 : return "FRI";
            case 6 : return "SAT";
            case 7 : return "SUN";
        }
        return null;
    }
}