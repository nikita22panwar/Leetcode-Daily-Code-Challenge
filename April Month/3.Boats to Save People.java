class Solution {
    public int numRescueBoats(int[] people, int limit) {
      Arrays.sort(people);
      int start=0;
      int end=people.length-1;
      int count=0;
      while(start<=end){
          int sum=people[start]+people[end];
          if(sum<=limit){
              count++;
              start++;
              end--;
          }else{
              count++;
              end--;
          }
      }
      return count;
  } 
}
