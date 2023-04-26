class Solution {
    public int addDigits(int num) {
        while( num >= 10  ){
            int ans = 0;
            while(num > 0){
            int x = num % 10;
            ans = ans + x;
            num/=10;
            } 
        num = ans;
        }
        
    return num;
    }
}
