class Solution {
    public int lastStoneWeight(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        if(n==1)
            return arr[0];
        Arrays.sort(arr);
        int i = n-1 , j = n-2;
        while(j>=0){
            if(arr[i]==arr[j]){
                arr[i] = 0;
                arr[j] = 0;
                j-=2;
                i-=2;
            }
            else if(arr[j]==0)
                return arr[i];
            else{
                arr[i] = arr[i] - arr[j];
                arr[j] = 0;
                Arrays.sort(arr);
                i = n-1; 
                j = n-2;
            }
        }
        Arrays.sort(arr);
        return arr[n-1];
    }
}
