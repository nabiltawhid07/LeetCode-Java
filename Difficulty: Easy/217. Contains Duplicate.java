class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            count=0;
            flag=false;
            int pointer=nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=2){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
