import java.util.*;
class Solution {
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        for(int i = 0; i<line.length;i++) {
            for(int j = i+1; j<line.length;j++) {
                Point node = findingNode(line[i][0], line[i][1], line[i][2], line[j][0],line[j][1],line[j][2]);
                if(node != null) {
                    points.add(node);
                }
            }
        }
        Point minPoint = getMin(points);
        Point maxPoint = getMax(points);
        
        int width = (int) (maxPoint.getpx() - minPoint.getpx() + 1);
        int height = (int) (maxPoint.getpy() - minPoint.getpy() + 1);
        
        char[][] arr = new char[height][width];
        for(char[] row : arr) {
            Arrays.fill(row, '.');
        }
        
        for(Point p : points) {
            int x = (int)(p.getpx() - minPoint.getpx());
            int y = (int)(maxPoint.getpy() - p.getpy());
            arr[y][x] = '*';
        }
        
        String[] answer = new String[arr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }
        
        return answer;
    }
    
    private Point findingNode(long a1, long b1, long c1, long a2, long b2, long c2) {
        double x = (double) ((b1*c2) - (c1*b2)) / ((a1*b2) - (b1*a2));
        double y = (double) ((c1*a2) - (a1*c2)) / ((a1*b2) - (b1*a2));
        if(x%1!=0 || y%1!=0) return null;
        return new Point((long)x,(long)y);
    }
    
    private Point getMin(List<Point> points) {
        long minx = Long.MAX_VALUE;
        long miny = Long.MAX_VALUE;
        
        for(Point p : points) {
            if(p.getpx() < minx) {
                minx = p.getpx();
            }
            if(p.getpy() < miny) {
                miny = p.getpy();
            }
        } 
        
        return new Point(minx, miny);
    }
    
    private Point getMax(List<Point> points) {
        long maxx = Long.MIN_VALUE;
        long maxy = Long.MIN_VALUE;
        
        for(Point p : points) {
            if(p.getpx() > maxx) {
                maxx = p.getpx();
            }
            if(p.getpy() > maxy) {
                maxy = p.getpy();
            }
        }
        return new Point(maxx, maxy);
    }
    
    private static class Point {
    private long px;
    private long py;
    public Point(long px, long py) {
        this.px = px;
        this.py = py;
    }
    public long getpx() {
        return this.px;
    }
    public long getpy() {
        return this.py;
    }
}
   
}
    


