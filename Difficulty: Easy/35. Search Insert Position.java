class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean flag=false;
        boolean flag2=false;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                flag=true;
                idx=i;
                break;
            }
        }
        if(flag==false){
            for(int j=0;j<nums.length;j++){
                if(nums[j]>target){
                    idx=j;
                    flag2=true;
                    break;
                }
            }
            if(flag2==false){
                idx=nums.length;
            }
        }
        return idx;
    }
}
