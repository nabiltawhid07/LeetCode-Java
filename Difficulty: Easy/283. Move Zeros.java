class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=0;
        int i=0;
        int j=0;
        for( i=0;i<nums.length;i++){
            if(nums[i]==0){
                 pointer=i;
                for( j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        int temp=nums[j];
                        nums[j]=0;
                        nums[pointer]=temp;
                        break;
                    }
                }
            }

        }
    }
}

//more efficient version(mine)
