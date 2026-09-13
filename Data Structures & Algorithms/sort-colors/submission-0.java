class Solution {
    public void sortColors(int[] nums) {
        int[] freq_count=new int[3];
        for(int num:nums){
            freq_count[num]++;
        }
        int index=0;
        for(int i=0;i<3;i++){
         while(freq_count[i]-- >0){
            nums[index++]=i;
         }
        }
        
    }
}