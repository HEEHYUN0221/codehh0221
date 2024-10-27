class Solution {
    public boolean solution(int x) {
        boolean answer = false; 
        if(x>0&&x<=10000){ 
            int sum = 0;
            int getx = x;
            int length = (int)(Math.log10(x)+1);
            int []a = new int[length];
            for(int i=0; i<length; i++){
            a[i]=getx%10;
            getx/=10;
            }
            for(int i=0; i<length; i++){
            sum+=a[i];
            }
            answer = (x%sum==0)?true:false;
        }
       
        return answer;
    }
}