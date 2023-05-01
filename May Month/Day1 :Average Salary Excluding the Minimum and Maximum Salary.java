class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        Arrays.sort(salary);
         int min=salary[0];
         int max=salary[n-1];
         double sum=0;
         for(int i=0; i<n; i++){
             sum+=salary[i];
         }
         sum=sum-min-max;
         return sum/(n-2);
    }
    
}
