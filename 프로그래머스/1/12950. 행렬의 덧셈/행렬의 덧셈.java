class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowlength = arr1.length;
        int collength = arr1[0].length;
        
            
        int[][] answer = new int[rowlength][collength];
        for(int i =0;i<rowlength;i++){
            for(int j=0;j<collength;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }  
        return answer;
    }
}