class Solution {
    public int majorityElement(int[] nums) {
        int c =0;
        int x=0;

          for(int i =0;i<nums.length;i++){
            if(x==0){
                c=nums[i];

            }
            if(nums[i]==c){
                x++;
            }
            else{
                x--;
            }
          }return c;
    }
}