class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer =0;
        int k=1;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[pointer+1]=nums[i+1];
                pointer=pointer+1;
                k++;
            }
        }
        return k;
    }
}

//slightly challenging...medium
