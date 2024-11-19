class Solution {
    public int solution(int[][] sizes) {
        int temp = 0;
        int max0 = 0;
        int max1 = 0;
        int rowlen = sizes.length;
        int collen = sizes[0].length;
        for(int i =0;i<rowlen;i++){
            if(sizes[i][0]<sizes[i][1]){
                temp=sizes[i][1];
                sizes[i][1]=sizes[i][0];
                sizes[i][0]=temp;
            }
        }
        
        for(int i =0;i<rowlen;i++){
            if(sizes[i][0]>max0){
                max0=sizes[i][0];
            }
            if(sizes[i][1]>max1){
                max1=sizes[i][1];
            }
        }
        return max0*max1;
    }
}