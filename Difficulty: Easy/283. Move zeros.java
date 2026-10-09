class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        sort
    //     boolean flag=false;
    //     for(int j=nums.length-1;j>=(nums.length-count);j--){
    //         flag=false;
    //         if(nums[j]!=0){
    //         flag=true;
    //         break;
    //         }
    //     }
    //     if(flag==true){
    //         sort(nums);
    //         checkArray(count,nums);
    //     }
    // }
    public int[] sort(int[] nums){
        for(int k=0;k<nums.length-1;k++){
            if(nums[k]==0){
                int temp=nums[k+1];
                nums[k+1]=nums[k];
                nums[k]=temp;
            }
            else if(nums[k]==0 && nums[k+1]==0){
                continue;
            }
            else{
                continue;
            }
        }
        return nums;
    }
    public void checkArray(int count,int[] nums){
  boolean flag=false;
        for(int j=nums.length-1;j>=(nums.length-count);j--){
            flag=false;
            if(nums[j]!=0){
            flag=true;
            break;
            }
        }
        if(flag==true){
            sort(nums);
            checkArray(count,nums);
        }
    }
}
